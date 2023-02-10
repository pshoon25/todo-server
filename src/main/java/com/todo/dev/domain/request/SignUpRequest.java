package com.todo.dev.domain.request;

import lombok.*;

@Getter@Setter@ToString
@AllArgsConstructor@NoArgsConstructor
public class SignUpRequest {
    private String member_id;
    private String member_pw;
    private String name;
    private String phone_number;
}
