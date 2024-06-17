package com.example.daedong.post.dto.response;

import com.example.daedong.post.entity.Post;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@AllArgsConstructor
public class PostResponseDto {

    private Long Id;
    private String title;
    private String content;
    private String author;



}
