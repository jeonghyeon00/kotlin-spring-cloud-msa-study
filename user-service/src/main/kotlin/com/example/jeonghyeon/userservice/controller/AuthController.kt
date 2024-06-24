package com.example.jeonghyeon.userservice.controller

import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/auth")
class AuthController {
    @PostMapping("/sign-up")
    fun signUp() {
        TODO()
    }

    @PostMapping("/sign-in")
    fun signIn() {
        TODO()
    }
}