package com.example.jeonghyeon.userservice.repository

import com.example.jeonghyeon.userservice.entity.User
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import java.util.UUID

@Repository
interface UserRepository: JpaRepository<User, UUID>