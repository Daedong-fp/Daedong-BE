package com.example.daedong.service;

import com.example.daedong.dto.request.UserIdRequest;
import com.example.daedong.entity.User;
import com.example.daedong.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ChangeIdService {
    private UserRepository userRepository;

    public void changeId(Long id, UserIdRequest userIdRequest) {
        User user = userRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("조회하신 회원은 없는 회원입니다."));

        user.changeUserId(userIdRequest.getUser_id());
        userRepository.save(user);
    }
}
