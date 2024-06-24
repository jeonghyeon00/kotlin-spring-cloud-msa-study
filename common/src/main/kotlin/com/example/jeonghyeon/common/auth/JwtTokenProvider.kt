package com.example.jeonghyeon.common.auth

import com.example.jeonghyeon.common.constants.Role
import io.jsonwebtoken.Jwts
import io.jsonwebtoken.security.Keys
import jakarta.annotation.PostConstruct
import org.springframework.beans.factory.annotation.Value
import org.springframework.stereotype.Component
import java.util.*
import javax.crypto.SecretKey

@Component
class JwtTokenProvider {
    companion object {
        private const val DURATION = 1000L * 60 * 60
    }

    @Value("\${jwt.secret}")
    private lateinit var secretKeyString: String

    private lateinit var secretKey: SecretKey

    @PostConstruct
    fun init() {
        secretKey = Keys.hmacShaKeyFor(secretKeyString.toByteArray())
    }


    fun createAccessToken(userId: UUID, roles: List<Role>): String {
        val claims = Jwts.claims().setSubject(userId.toString())
        claims["roles"] = roles.map { it.name }

        val now = Date()
        val expiration = Date(now.time + DURATION)

        return Jwts.builder()
            .setClaims(claims)
            .setIssuedAt(now)
            .setExpiration(expiration)
            .signWith(secretKey)
            .compact()
    }

    fun validateToken(token: String): Boolean {
        return try {
            true
//            Jwts.parserBuilder().setSigningKey(secretKey).build().parseClaimsJws(token)
//            true
        } catch (e: Exception) {
            false
        }
    }

    fun getSubject(token: String) =
        Jwts.parserBuilder().setSigningKey(secretKey).build().parseClaimsJws(token).body.subject
}
