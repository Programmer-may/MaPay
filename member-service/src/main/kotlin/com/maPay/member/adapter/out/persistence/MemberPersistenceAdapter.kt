package com.maPay.member.adapter.out.persistence

import com.maPay.member.application.port.out.RegisterMemberPort
import com.maPay.member.domain.Member
import common.annotation.PersistenceAdapter

@PersistenceAdapter
class MemberPersistenceAdapter(

    private val memberRepository: MemberRepository
) : RegisterMemberPort {
    override fun createMember(
        memberName: Member.MemberName,
        memberEmail: Member.MemberEmail,
        memberAddress: Member.MemberAddress,
        memberIsValid: Member.MemberIsValid,
        memberIsCorp: Member.MemberIsCorp
    ): MemberEntity {
        return memberRepository.save(
            MemberEntity(
                memberName.value,
                memberEmail.value,
                memberAddress.value,
                memberIsValid.value,
                memberIsCorp.value
            )
        )
    }
}