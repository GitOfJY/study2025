package io.security.security_ex.v1;

import io.security.security_ex.SecurityContextService;
import io.security.security_ex.SessionInfoService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.annotation.CurrentSecurityContext;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class IndexController {

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/custom")
    public String custom() {
        return "custom";
    }

    @GetMapping("/user/{name}")
    public String userName(@PathVariable(value="name") String name) {
        return name;
    }

    @GetMapping("/api/photos")
    public String photos() {
        return "photos";
    }

    @GetMapping("/oauth/login")
    public String oauth() {
        return "oauthLogin";
    }
}
