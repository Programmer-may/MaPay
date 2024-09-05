package com.maPay.member.adapter.out.persistence

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
}