package com.maPay.member.application.port.`in`

import com.maPay.member.adapter.out.persistence.dto.RegisterMemberResponse
import com.maPay.member.application.port.`in`.command.RegisterMemberCommand
import common.annotation.UseCase

@UseCase
interface RegisterMemberUseCase {

    fun registerMember(registerMemberCommand: RegisterMemberCommand): RegisterMemberResponse
}