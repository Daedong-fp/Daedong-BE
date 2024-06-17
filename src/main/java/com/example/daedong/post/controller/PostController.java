package com.example.daedong.post.controller;

import com.example.daedong.post.dto.request.PostRequestDto;
import com.example.daedong.post.dto.response.PostResponseDto;
import com.example.daedong.post.service.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping("/post")
public class PostController {

    private final PostService postService;

    @PostMapping("/{id}")
    public ResponseEntity<PostResponseDto> createPost(PostRequestDto postRequestDto) {
        PostResponseDto createdPost = postService.createPost(postRequestDto);
        return new ResponseEntity<>(createdPost, HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<PostResponseDto> getPost(@PathVariable Long id) {
        PostResponseDto post = postService.getPost(id);
        return ResponseEntity.ok(post);
    }

    @PutMapping("/{id}") // putmapping patchmapping 차이점 알아보기
    public ResponseEntity<PostResponseDto> updatePost(@PathVariable Long id, PostRequestDto postRequestDto) {
        PostResponseDto updatedPost = postService.updatePost(id, postRequestDto);
        return ResponseEntity.ok(updatedPost);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletePost(@PathVariable Long id) {
        postService.deletePost(id);
        return ResponseEntity.noContent().build();
    }
}
