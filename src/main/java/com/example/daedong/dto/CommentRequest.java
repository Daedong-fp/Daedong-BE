package com.example.daedong.dto;

import lombok.Getter;

@Getter
public class CommentRequest {
    private String user_name;
    private String content;
    private Long postId;
}
