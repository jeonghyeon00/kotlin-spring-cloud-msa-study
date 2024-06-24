package com.example.jeonghyeon.gateway.security

import com.example.jeonghyeon.common.auth.JwtTokenProvider
import org.apache.http.HttpHeaders
import org.springframework.cloud.gateway.filter.GatewayFilter
import org.springframework.cloud.gateway.filter.factory.AbstractGatewayFilterFactory
import org.springframework.http.HttpStatus
import org.springframework.stereotype.Component

@Component
class JwtTokenFilter(private val jwtTokenProvider: JwtTokenProvider) : AbstractGatewayFilterFactory<JwtTokenFilter.Config>(Config::class.java) {
    private val excludePaths = listOf(
        "/auth/",
    )
    class Config

    override fun apply(config: Config?): GatewayFilter {
        return GatewayFilter { exchange, chain ->
            val token = exchange.request.headers[HttpHeaders.AUTHORIZATION]?.get(0)?.removePrefix("Bearer ")
            if(isExcludePath(exchange.request.uri.path)) {
                return@GatewayFilter chain.filter(exchange)
            }
            if (token == null || !jwtTokenProvider.validateToken(token)) {
                exchange.response.statusCode = HttpStatus.UNAUTHORIZED
                return@GatewayFilter exchange.response.setComplete()
            }

            return@GatewayFilter chain.filter(exchange)
        }
    }

    private fun isExcludePath(path: String): Boolean {
        return excludePaths.any { path.contains(it) }
    }
}
