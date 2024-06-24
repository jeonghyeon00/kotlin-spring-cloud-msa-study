package com.example.jeonghyeon.userservice.entity

import com.example.jeonghyeon.userservice.constants.UserCredentialType
import jakarta.persistence.*

/**
 * 사용자 로그인 정보 저장
 */
@Entity
@Table(name = "user_credential")
class UserCredential(
    @Column(name = "credential_type")
    @Enumerated(value = EnumType.STRING)
    val userCredentialType: UserCredentialType,

    @Column(name = "credential")
    val credential: String,

    // used when userCredentialType is NORMAL
    @Column(name = "loginId")
    val loginId: String?,

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    val user: User
) {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0
}