package io.security.springsecuritymaster.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AccountDto {
    private Long id;  // JPA와 연동을 위해
    private String username;
    private String password;
    private int age;
    private String roles;
}
