package com.ricardo.todo.controllers;

import com.ricardo.todo.dtos.LoginRequestDTO;
import com.ricardo.todo.services.AuthService;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.context.SecurityContextHolderStrategy;
import org.springframework.security.web.context.HttpSessionSecurityContextRepository;
import org.springframework.security.web.context.SecurityContextRepository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthController {
    private final AuthService authService;
    private final SecurityContextHolderStrategy securityContextHolderStrategy =
            SecurityContextHolder.getContextHolderStrategy();
    private final SecurityContextRepository securityContextRepository =
            new HttpSessionSecurityContextRepository();


    public AuthController(AuthService authService) {
        this.authService = authService;
    }

    private void saveNewSecurityContext(Authentication authentication, HttpServletRequest request, HttpServletResponse response) {
        SecurityContext context = this.securityContextHolderStrategy.createEmptyContext();
        context.setAuthentication(authentication);
        this.securityContextHolderStrategy.setContext(context);
        this.securityContextRepository.saveContext(context, request, response);
    }

    @PostMapping("/login")
    public void login(@RequestBody LoginRequestDTO loginRequest, HttpServletRequest request, HttpServletResponse response) {
        Authentication authenticationResponse = authService.login(loginRequest);

        saveNewSecurityContext(authenticationResponse, request, response);
    }
}
