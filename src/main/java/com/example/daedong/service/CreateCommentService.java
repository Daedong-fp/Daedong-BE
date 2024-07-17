package com.example.daedong.service;

import com.example.daedong.dto.CommentRequest;
import com.example.daedong.entity.Comment;
import com.example.daedong.repository.CommentRepository;
import lombok.Builder;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Builder
public class CreateCommentService {
    private final CommentRepository commentRepository;

    public void createComment(CommentRequest req) {
        Comment comment = Comment.builder()
                .content(req.getContent())
                .user_name(req.getUser_name())
                .build();
        commentRepository.save(comment);
    }
}
