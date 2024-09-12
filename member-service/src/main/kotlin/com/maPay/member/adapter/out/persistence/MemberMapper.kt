package com.maPay.member.adapter.out.persistence

import com.maPay.member.adapter.out.persistence.dto.RegisterMemberResponse
import com.maPay.member.domain.Member
import org.springframework.stereotype.Component

@Component
class MemberMapper {
    fun mapToDomainFrom(memberEntity: MemberEntity): Member {
        return Member.generateMember(
            Member.MemberId(memberEntity.id),
            Member.MemberName(memberEntity.name),
            Member.MemberEmail(memberEntity.email),
            Member.MemberAddress(memberEntity.address),
            Member.MemberIsValid(memberEntity.isValid),
            Member.MemberIsCorp(memberEntity.isCorp)
        )
    }

    fun mapToDtoFrom(member: Member): RegisterMemberResponse {
        return RegisterMemberResponse(
            member.id,
            member.name,
            member.email,
            member.address,
            member.isValid,
            member.isCorp
        )
    }
}