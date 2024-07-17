package com.example.daedong.service;

import com.example.daedong.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DeleteService {
    private final UserRepository userRepository;

    public void userDelete(Long id) {
        userRepository.deleteById(id);
    }
}
