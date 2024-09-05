package com.maPay.member.adapter.`in`.web

import com.maPay.member.adapter.`in`.web.dto.RegisterMemberRequest
import com.maPay.member.application.port.`in`.RegisterMemberUseCase
import com.maPay.member.domain.Member
import common.annotation.WebAdapter
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@WebAdapter
@RestController
@RequestMapping("/member")
class RegisterMemberController(

    private val registerMemberUseCase: RegisterMemberUseCase
) {

    @PostMapping
    fun resisterMember(@RequestBody request: RegisterMemberRequest): ResponseEntity<Member> {
        val member = registerMemberUseCase.registerMember(request.mapToCommand())
        return ResponseEntity.ok().body(member)
    }
}