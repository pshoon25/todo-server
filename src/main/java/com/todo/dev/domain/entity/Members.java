package com.todo.dev.domain.entity;

import com.todo.dev.domain.request.SignUpRequest;
import lombok.*;

@Getter@Setter@ToString
@AllArgsConstructor@NoArgsConstructor
@Builder
public class Members {
    private Integer id;
    private String member_id;
    private String member_pw;
    private String name;
    private String phone_number;
}
