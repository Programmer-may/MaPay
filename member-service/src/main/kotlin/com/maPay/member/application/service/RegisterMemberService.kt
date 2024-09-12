package com.maPay.member.application.service

import com.maPay.member.adapter.out.persistence.MemberMapper
import com.maPay.member.adapter.out.persistence.dto.RegisterMemberResponse
import com.maPay.member.application.port.`in`.command.RegisterMemberCommand
import com.maPay.member.application.port.`in`.RegisterMemberUseCase
import com.maPay.member.application.port.out.RegisterMemberPort
import com.maPay.member.domain.Member
import jakarta.transaction.Transactional
import org.springframework.stereotype.Service

@Service
@Transactional
class RegisterMemberService(

    private val registerMemberPort: RegisterMemberPort,

    private val memberMapper: MemberMapper
) : RegisterMemberUseCase {

    override fun registerMember(registerMemberCommand: RegisterMemberCommand): RegisterMemberResponse {
        val memberEntity = registerMemberPort.createMember(
            Member.MemberName(registerMemberCommand.name),
            Member.MemberEmail(registerMemberCommand.email),
            Member.MemberAddress(registerMemberCommand.address),
            Member.MemberIsValid(registerMemberCommand.isValid),
            Member.MemberIsCorp(registerMemberCommand.isCorp)
        )
        val memberDomain = memberMapper.mapToDomainFrom(memberEntity)
        return memberMapper.mapToDtoFrom(memberDomain)
    }
}
