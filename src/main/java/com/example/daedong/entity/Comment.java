package com.example.daedong.entity;

import com.example.daedong.dto.CommentRequest;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String user_name;
    
    private String content;
    
    private Long postId;


    public void updateComment(CommentRequest commentRequest) {
        this.user_name = commentRequest.getUser_name();
        this.content = commentRequest.getContent();
    }
}
