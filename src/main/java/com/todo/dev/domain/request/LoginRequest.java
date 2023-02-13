package com.todo.dev.domain.request;

import lombok.*;

@Getter@Setter@ToString
@AllArgsConstructor@NoArgsConstructor
public class LoginRequest {
    private String memberId;
    private String memberPw;
}
