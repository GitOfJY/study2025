package io.security.springsecuritymaster.security.exception;

import org.springframework.security.core.AuthenticationException;

public class SecretException extends AuthenticationException {
    // 인증 예외 상속
    public SecretException(String message) {
        super(message);
    }
}
