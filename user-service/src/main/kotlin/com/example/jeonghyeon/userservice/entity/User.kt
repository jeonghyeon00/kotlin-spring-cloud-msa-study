package com.example.jeonghyeon.userservice.entity

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.Id
import jakarta.persistence.Table
import java.util.UUID

@Entity
@Table(name = "users")
class User(
    @Column(name = "name")
    val name: String
) {
    @Id
    val id: UUID = UUID.randomUUID()
}