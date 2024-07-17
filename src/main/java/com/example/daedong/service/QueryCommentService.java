package com.example.daedong.service;

import com.example.daedong.dto.CommentListResponse;
import com.example.daedong.entity.Comment;
import com.example.daedong.repository.CommentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class QueryCommentService {
    private final CommentRepository commentRepository;

    public CommentListResponse queryComment(Long Id) {
        Comment comment = commentRepository.findById(Id)
                .orElseThrow(()->new RuntimeException("not found"));

        return CommentListResponse.builder()
                .user_name(comment.getUser_name())
                .content(comment.getUser_name())
                .postId(comment.getPostId())
                .build();
    }
}
