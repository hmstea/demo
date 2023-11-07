package com.example.demo.member;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * packageName    : com.example.demo.member
 * fileName       : MemberDto
 * author         : hwangmiseon
 * date           : 11/6/23
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 11/6/23        hwangmiseon       최초 생성
 */
@Data
@Builder
public class MemberDto {

  private String name;

}
