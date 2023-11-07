package com.example.demo.member;

import org.springframework.stereotype.Component;

/**
 * packageName    : com.example.demo.member
 * fileName       : SampleBean
 * author         : hwangmiseon
 * date           : 10/30/23
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 10/30/23        hwangmiseon       최초 생성
 */
@Component
public class SampleBean {
  public String hello(){
    return "hello";
  }
}
