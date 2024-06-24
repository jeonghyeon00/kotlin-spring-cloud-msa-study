package com.example.jeonghyeon.userservice.service

import com.example.jeonghyeon.common.auth.JwtTokenProvider
import org.springframework.stereotype.Service

@Service
class AuthService(
    private val jwtTokenProvider: JwtTokenProvider
) {
}