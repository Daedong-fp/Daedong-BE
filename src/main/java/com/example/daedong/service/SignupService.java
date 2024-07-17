package com.example.daedong.service;

import com.example.daedong.dto.request.UserRequest;
import com.example.daedong.entity.User;
import com.example.daedong.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SignupService {
    private final UserRepository userRepository;

    public void userSignup(UserRequest request) {
    User user = new User(request.getUser_id(), request.getUser_name(), request.getUser_password());

    userRepository.save(user);
    }
}
