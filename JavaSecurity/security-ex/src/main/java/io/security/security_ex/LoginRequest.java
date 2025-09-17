package io.security.security_ex;

import lombok.Data;

@Data
public class LoginRequest {
    private String username;
    private String password;
}
