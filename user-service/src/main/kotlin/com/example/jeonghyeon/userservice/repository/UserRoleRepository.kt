package com.example.jeonghyeon.userservice.repository

import com.example.jeonghyeon.userservice.entity.UserRole
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface UserRoleRepository: JpaRepository<UserRole, Long>