package com.example.daedong.service;

import com.example.daedong.dto.CommentRequest;
import com.example.daedong.entity.Comment;
import com.example.daedong.repository.CommentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class UpdateCommentService {
    private final CommentRepository commentRepository;

    @Transactional
    public void updateComment(Long id, CommentRequest commentRequest) {
        commentRepository.findById(id).orElseThrow(() -> new RuntimeException("Not Found"));
        Comment comment = Comment.builder()
                .content(commentRequest.getContent())
                .user_name(commentRequest.getUser_name())
                .build();
    }
}
