package com.example.daedong.service;

import com.example.daedong.dto.request.PasswordRequest;
import com.example.daedong.entity.User;
import com.example.daedong.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ChangePasswordService {
    private UserRepository userRepository;

    public void changePassword(Long id, PasswordRequest passwordRequest) {
        User user = userRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("조회하신 회원은 없는 회원입니다."));

        user.changeUserPassword(passwordRequest.getUser_password());
        userRepository.save(user);
    }
}

