package com.example.daedong.post.service;


import com.example.daedong.post.dto.request.PostRequestDto;
import com.example.daedong.post.dto.response.PostResponseDto;
import com.example.daedong.post.entity.Post;
import com.example.daedong.post.repository.PostRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
    public class PostService {

    private final PostRepository postRepository;



    public PostResponseDto createPost(PostRequestDto postRequestDto) {
        Post post = Post.builder()
                .title(postRequestDto.getAuthor())
                .content(postRequestDto.getTitle())
                .author(postRequestDto.getAuthor())
                .build();


        Post savedPost = postRepository.save(post);

        return new PostResponseDto(savedPost.getId(), savedPost.getTitle(), savedPost.getContent(), savedPost.getAuthor());
    }



        public PostResponseDto getPost(Long id) {
            Post post = postRepository.findById(id)
                    .orElseThrow(() -> new RuntimeException("not found"));

            return new PostResponseDto(post.getId(), post.getTitle(), post.getContent(), post.getAuthor());

        }


        public PostResponseDto updatePost(Long id, PostRequestDto postRequestDto) {
            Post post = postRepository.findById(id)
                    .orElseThrow(() -> new RuntimeException("not found"));

            post.update(postRequestDto);
            Post updatedPost = postRepository.save(post);

            return new PostResponseDto(updatedPost.getId(), updatedPost.getTitle(), updatedPost.getContent(), updatedPost.getAuthor());

        }


        public void deletePost(Long id) {
            if (!postRepository.existsById(id)) {
                throw new RuntimeException("not found");
            }
            postRepository.deleteById(id);
        }
    }


