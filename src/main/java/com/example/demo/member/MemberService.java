package com.example.demo.member;

import java.util.Optional;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * packageName    : com.example.demo.member
 * fileName       : MemberService
 * author         : hwangmiseon
 * date           : 10/30/23
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 10/30/23        hwangmiseon       최초 생성
 */
@Service
@AllArgsConstructor
public class MemberService {
  private final MemberRepository memberRepository;

  public void saveMember(Member member) throws Exception{
    memberRepository.save(member);
  }

  public Member findMember(String name) throws Exception {
    saveMember(Member.builder().name(name).build());
    return memberRepository.findByName(name).orElse(new Member());
  }

  public String memberTest() throws Exception {
    return "bar";
  }


}
