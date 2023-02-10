package com.todo.dev.domain.request;

import lombok.*;

@Getter@Setter@ToString
@AllArgsConstructor@NoArgsConstructor
public class LoginRequest {
    private String member_id;
    private String member_pw;
}
