package com.example.daedong.service;

import com.example.daedong.dto.response.UserResponse;
import com.example.daedong.entity.User;
import com.example.daedong.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserViewService {
    private final UserRepository userRepository;

    public UserResponse userView(Long id) {
        User user = userRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("조회하신 회원은 없는 회원입니다."));
        return new UserResponse(user.getUser_id(), user.getUser_name());
    }
}
