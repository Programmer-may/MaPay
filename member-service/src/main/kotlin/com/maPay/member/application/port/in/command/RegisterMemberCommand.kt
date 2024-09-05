package com.maPay.member.application.port.`in`.command

import common.util.SelfValidating
import jakarta.validation.constraints.AssertTrue
import jakarta.validation.constraints.NotBlank
import jakarta.validation.constraints.NotNull
import lombok.EqualsAndHashCode

@EqualsAndHashCode(callSuper = false)
data class RegisterMemberCommand(

    @NotNull
    @NotBlank
    val name: String,

    @NotNull
    @NotBlank
    val email: String,

    @NotNull
    @NotBlank
    val address: String,

    @AssertTrue
    val isValid: Boolean,

    val isCorp: Boolean
) : SelfValidating<RegisterMemberCommand>() {

    init {
        validateSelf()
    }
}
