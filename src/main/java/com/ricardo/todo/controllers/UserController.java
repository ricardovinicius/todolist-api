package com.ricardo.todo.controllers;

import com.ricardo.todo.dtos.UserCreateDTO;
import com.ricardo.todo.dtos.UserResponseDTO;
import com.ricardo.todo.models.User;
import com.ricardo.todo.services.UserService;
import jakarta.validation.Valid;
import org.modelmapper.ModelMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/user")
@Validated
public class UserController {
    private final UserService userService;
    private final ModelMapper modelMapper;

    public UserController(UserService userService, ModelMapper modelMapper) {
        this.userService = userService;
        this.modelMapper = modelMapper;
    }

    @GetMapping("/me")
    public ResponseEntity<UserResponseDTO> getMe(@AuthenticationPrincipal UserDetails userDetails) {
        User user = userService.getUserByUsername(userDetails.getUsername());
        UserResponseDTO userResponseDTO = modelMapper.map(user, UserResponseDTO.class);

        return ResponseEntity.ok(userResponseDTO);
    }

    @GetMapping("/{userId}")
    public ResponseEntity<UserResponseDTO> getUser(@PathVariable Long userId) {
        User user = userService.getUserById(userId);

        if (user == null) {
            return ResponseEntity.notFound().build();
        }

        UserResponseDTO userResponseDTO = modelMapper.map(user, UserResponseDTO.class);

        return ResponseEntity.ok(userResponseDTO);
    }

    @PostMapping()
    public ResponseEntity<Void> createUser(@Validated @RequestBody UserCreateDTO userCreateDTO) {
        userService.createNewUser(userCreateDTO);

        return ResponseEntity.ok().build();
    }
}
