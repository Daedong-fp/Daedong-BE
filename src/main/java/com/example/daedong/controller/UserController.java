package com.example.daedong.controller;

import com.example.daedong.dto.request.PasswordRequest;
import com.example.daedong.dto.request.UserIdRequest;
import com.example.daedong.dto.request.UserRequest;
import com.example.daedong.dto.response.UserResponse;
import com.example.daedong.service.*;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class UserController {

    private final DeleteService deleteService;
    private final SignupService signupService;
    private final UserViewService userViewService;
    private final ChangePasswordService changePasswordService;
    private final ChangeIdService changeIdService;

    @PostMapping("/signup")
    public void signup(@RequestBody UserRequest userRequest) {
        signupService.userSignup(userRequest);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Long id) {
        deleteService.userDelete(id);
    }

    @GetMapping("/{id}")
    public UserResponse view(@PathVariable("id") Long id) {
        return userViewService.userView(id);
    }

    @PatchMapping("/change_pw/{id}")
    public void changePassword(@PathVariable("id") Long id, PasswordRequest passwordRequest) {
        changePasswordService.changePassword(id, passwordRequest);
    }

    @PatchMapping("/change_id/{id}")
    public void changeId(@PathVariable("id") Long id, UserIdRequest userIdRequest) {
        changeIdService.changeId(id, userIdRequest);
    }
}
