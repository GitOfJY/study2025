package io.security.security_ex.v1;

import org.springframework.security.access.expression.method.MethodSecurityExpressionOperations;
import org.springframework.stereotype.Component;

@Component("myAuthorizer")
public class MyAuthorizer {
    public boolean isUser(MethodSecurityExpressionOperations root) {
        return root.hasAnyAuthority("ROLE_USER");
    }
}
