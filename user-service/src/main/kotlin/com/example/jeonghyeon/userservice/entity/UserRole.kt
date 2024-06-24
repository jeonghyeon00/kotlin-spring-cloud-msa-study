package com.example.jeonghyeon.userservice.entity

import com.example.jeonghyeon.common.constants.Role
import jakarta.persistence.*

@Entity
@Table(name = "user_role")
class UserRole(
    @Column(name = "role")
    @Enumerated(value = EnumType.STRING)
    val role: Role,

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    val user: User
) {
    @Id
    val id: Long = 0
}