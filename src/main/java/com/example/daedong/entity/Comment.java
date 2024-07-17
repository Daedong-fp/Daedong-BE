package com.example.daedong.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AccessLevel;
import lombok.Builder;
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

    @Builder
    public Comment(String user_name, String content, Long postId) {
        this.user_name = user_name;
        this.postId = postId;
        this.content = content;
    }
}
