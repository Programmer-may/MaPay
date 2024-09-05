package com.maPay.member.application.port.out

import com.maPay.member.adapter.out.persistence.MemberEntity
import com.maPay.member.domain.Member

interface RegisterMemberPort {

    fun createMember(
        memberName: Member.MemberName,
        memberEmail: Member.MemberEmail,
        memberAddress: Member.MemberAddress,
        memberIsValid: Member.MemberIsValid,
        memberIsCorp: Member.MemberIsCorp
    ): MemberEntity
}