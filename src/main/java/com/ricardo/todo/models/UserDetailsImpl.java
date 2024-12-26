package com.ricardo.todo.models;

import org.springframework.security.core.CredentialsContainer;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.List;

// TODO: Try to implement a single entity that implements UserDetails and CredentialsContainer instead of this
// TODO: Explore the Roles and Authorities implementations
public class UserDetailsImpl implements UserDetails, CredentialsContainer {
    private final User user;

    public UserDetailsImpl(User user) {
        this.user = user;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return List.of();
    }

    @Override
    public String getPassword() {
        return user.getPassword();
    }

    @Override
    public String getUsername() {
        return user.getUsername();
    }

    @Override
    public void eraseCredentials() {
        if (user != null) {
            user.setPassword(null);
        }
    }
}
