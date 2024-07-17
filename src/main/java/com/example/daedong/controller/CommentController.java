package com.example.daedong.controller;

import com.example.daedong.dto.CommentListResponse;
import com.example.daedong.dto.CommentRequest;
import com.example.daedong.service.CreateCommentService;
import com.example.daedong.service.DeleteCommentService;
import com.example.daedong.service.QueryCommentService;
import com.example.daedong.service.UpdateCommentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/comment")
@RequiredArgsConstructor
public class CommentController {
    private final CreateCommentService createCommentService;
    private final DeleteCommentService deleteCommentService;
    private final QueryCommentService queryCommentService;
    private final UpdateCommentService updateCommentService;

    @PostMapping
    public void createComment(@RequestBody CommentRequest req) {
        createCommentService.createComment(req);
   }

   @GetMapping("/{id}")
   public CommentListResponse queryComment(@PathVariable Long id) {
        return queryCommentService.queryComment(id);
   }

    @DeleteMapping("/{id}")
    public void deleteComment(@PathVariable Long id) {
        deleteCommentService.deleteComment(id);
    }

    @PatchMapping("/{id}")
    public void updateComment(@PathVariable Long id, @RequestBody CommentRequest req) {
        updateCommentService.updateComment(id, req);
    }

}
