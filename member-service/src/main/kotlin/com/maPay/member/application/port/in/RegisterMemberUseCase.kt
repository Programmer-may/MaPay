package com.maPay.member.application.port.`in`

import com.maPay.member.application.port.`in`.command.RegisterMemberCommand
import com.maPay.member.domain.Member
import common.annotation.UseCase

@UseCase
interface RegisterMemberUseCase {

    fun registerMember(registerMemberCommand: RegisterMemberCommand): Member
}