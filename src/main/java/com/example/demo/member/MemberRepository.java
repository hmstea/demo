package com.example.demo.member;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * packageName    : com.example.demo.member
 * fileName       : MemberRepository
 * author         : hwangmiseon
 * date           : 10/30/23
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 10/30/23        hwangmiseon       최초 생성
 */
public interface MemberRepository extends JpaRepository<Member, Long> {
  Optional<Member> findByName(String name);
}
