package com.example.demo.member;

import java.util.Map;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * packageName    : com.example.demo.member
 * fileName       : MemberController
 * author         : hwangmiseon
 * date           : 10/30/23
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 10/30/23        hwangmiseon       최초 생성
 */
@RestController
@AllArgsConstructor
public class MemberController {
  private final MemberService memberService;

  @GetMapping(value = "/member/{name}")
  public MemberDto member(@PathVariable String name) throws Exception{
    return MemberDto.builder().name(memberService.findMember(name).getName()).build();
  }

  @GetMapping(value = "/member2/{name}")
  public MemberDto member2(@PathVariable String name) throws Exception{
    return MemberDto.builder().name(memberService.findMember(name).getName()).build();
  }
}
