package com.ricardo.todo.services;

import com.ricardo.todo.dtos.UserCreateDTO;
import com.ricardo.todo.models.User;
import com.ricardo.todo.repositories.UserRepository;
import jakarta.validation.Valid;
import org.modelmapper.ModelMapper;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private final UserRepository userRepository;
    private final ModelMapper modelMapper;
    private final PasswordEncoder passwordEncoder;

    public UserService(UserRepository userRepository, ModelMapper modelMapper, PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.modelMapper = modelMapper;
        this.passwordEncoder = passwordEncoder;
    }

    public User getUserByUsername(String username) {
        return userRepository.findByUsername(username);
    }

    @PreAuthorize("#id == principal.id || hasRole('ADMIN')")
    public User getUserById(Long id) {
        return userRepository.findById(id).orElse(null);
    }

    public void createNewUser(UserCreateDTO userCreateDTO) {
        User user = modelMapper.map(userCreateDTO, User.class);
        user.setRole(User.Role.ROLE_USER);
        user.setPassword(passwordEncoder.encode(user.getPassword()));

        userRepository.save(user);
    }
}
