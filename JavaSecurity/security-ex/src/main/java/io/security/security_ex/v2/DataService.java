package io.security.security_ex.v2;

import org.springframework.security.access.prepost.PostAuthorize;
import org.springframework.security.access.prepost.PostFilter;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.access.prepost.PreFilter;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class DataService {
    // @PreAuthorize("hasAuthority('ROLE_USER')")
    public String getUser() {
        return "user";
    }

    // @PostAuthorize("returnObject.owner == authentication.name")
    public Account getOwner(String username) {
        return new Account(username, false);
    }

    public String display() {
        return "display";
    }
}
