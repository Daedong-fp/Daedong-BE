package com.example.daedong.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String user_id;

    @Column
    private String user_name;

    @Column(unique = true)
    private String user_password;

    public User( String user_id, String user_name, String user_password) {
        this.user_id = user_id;
        this.user_name = user_name;
        this.user_password = user_password;
    }

    public void changeUserPassword(String user_password) {
        this.user_password = user_password;
    }

    public void changeUserId(String user_id) {
        this.user_id = user_id;
    }

}
