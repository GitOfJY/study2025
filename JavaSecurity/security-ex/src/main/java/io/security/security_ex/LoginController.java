package io.security.security_ex;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.context.HttpSessionSecurityContextRepository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class LoginController {
    private final AuthenticationManager authenticationManager;
    private final HttpSessionSecurityContextRepository httpSessionSecurityContextRepository = new HttpSessionSecurityContextRepository();

    @PostMapping("/login")
    public Authentication login(@RequestBody LoginRequest login, HttpServletRequest request, HttpServletResponse response) {
        // 인증 되지 않은 인증 객체 생성
        UsernamePasswordAuthenticationToken token = UsernamePasswordAuthenticationToken.unauthenticated(login.getUsername(), login.getPassword());
        
        // 인증 시도 후 최종 인증 결과 반환
        Authentication auth = authenticationManager.authenticate(token);
        
        // 인증 결과 context, threadLocal 저장
        SecurityContext securityContext = SecurityContextHolder.getContextHolderStrategy().createEmptyContext();
        securityContext.setAuthentication(auth);
        SecurityContextHolder.getContextHolderStrategy().setContext(securityContext);
        
        // 컨텍스트를 세션에 저장해서 인증 상태 영속
        httpSessionSecurityContextRepository.saveContext(securityContext, request, response);
        return auth;
    }

}
