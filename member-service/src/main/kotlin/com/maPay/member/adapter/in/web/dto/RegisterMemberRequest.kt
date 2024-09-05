package com.maPay.member.adapter.`in`.web.dto

import com.maPay.member.application.port.`in`.command.RegisterMemberCommand

data class RegisterMemberRequest(
    val name: String,
    val email: String,
    val address: String,
    val isCorp: Boolean
) {
    internal fun mapToCommand(): RegisterMemberCommand {
        return RegisterMemberCommand(
            name = name,
            email = email,
            address = address,
            isValid = true,
            isCorp = isCorp
        )
    }
}
