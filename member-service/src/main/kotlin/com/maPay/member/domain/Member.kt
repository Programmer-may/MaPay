package com.maPay.member.domain

data class Member private constructor(
    val id: Long,
    val name: String,
    val email: String,
    val address: String,
    val isValid: Boolean,
    val isCorp: Boolean
) {
    companion object {
        fun generateMember(
            memberId: MemberId,
            memberName: MemberName,
            memberEmail: MemberEmail,
            memberAddress: MemberAddress,
            memberIsValid: MemberIsValid,
            memberIsCorp: MemberIsCorp
        ): Member {
            return Member(
                memberId.value,
                memberName.value,
                memberEmail.value,
                memberAddress.value,
                memberIsValid.value,
                memberIsCorp.value
            )
        }
    }

    @JvmInline
    value class MemberId(val value: Long)

    @JvmInline
    value class MemberName(val value: String)

    @JvmInline
    value class MemberEmail(val value: String)

    @JvmInline
    value class MemberAddress(val value: String)

    @JvmInline
    value class MemberIsValid(val value: Boolean)

    @JvmInline
    value class MemberIsCorp(val value: Boolean)
}