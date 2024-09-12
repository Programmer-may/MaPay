package com.maPay.member.adapter.out.persistence.dto

data class RegisterMemberResponse(

    val id: Long,
    val name: String,
    val email: String,
    val address: String,
    val isValid: Boolean,
    val isCorp: Boolean
)
