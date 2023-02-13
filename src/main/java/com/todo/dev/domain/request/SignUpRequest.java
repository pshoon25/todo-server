package com.todo.dev.domain.request;

import lombok.*;

@Getter@Setter@ToString
@AllArgsConstructor@NoArgsConstructor
public class SignUpRequest {
    private String memberId;
    private String memberPw;
    private String name;
    private String phone_number;
}
