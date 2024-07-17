package com.example.daedong.dto.request;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class UserRequest {
    private String user_id;
    private String user_name;
    private String user_password;
}
