package com.maPay.member.adapter.out.persistence

import common.baseentity.BaseEntity
import jakarta.persistence.Entity
import jakarta.persistence.Table

@Entity
@Table(name = "members")
data class MemberEntity(

    var name: String,
    var email: String,
    var address: String,
    var isValid: Boolean,
    var isCorp: Boolean
) : BaseEntity()