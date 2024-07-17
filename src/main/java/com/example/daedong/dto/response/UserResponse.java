package com.example.daedong.dto.response;

import lombok.Getter;

@Getter
public class UserResponse {
    private String user_id;
    private String user_name;

    public UserResponse(String user_id, String user_name) {
        this.user_id = user_id;
        this.user_name = user_name;
    }
}
