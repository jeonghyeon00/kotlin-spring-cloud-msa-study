package com.example.jeonghyeon.userservice.repository

import com.example.jeonghyeon.userservice.entity.UserCredential
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface UserCredentialRepository: JpaRepository<UserCredential, Long>