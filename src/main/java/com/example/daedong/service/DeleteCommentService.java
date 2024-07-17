package com.example.daedong.service;

import com.example.daedong.repository.CommentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DeleteCommentService {
    private final CommentRepository commentRepository;

    public void deleteComment(Long Id) {
        commentRepository.deleteById(Id);
    }
}
