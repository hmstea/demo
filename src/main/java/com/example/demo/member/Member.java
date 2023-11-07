package com.example.demo.member;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * packageName    : com.example.demo.member
 * fileName       : Member
 * author         : hwangmiseon
 * date           : 10/30/23
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 10/30/23        hwangmiseon       최초 생성
 */
@Entity
@Builder
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Member {
  @Id
  @GeneratedValue
  private Long id;
  private String name;
}
