package com.todo.dev.domain.entity;

import lombok.*;

@Getter@Setter@ToString
@AllArgsConstructor@NoArgsConstructor
@Builder
public class Members {
    private Integer id;
    private String memberId;
    private String memberPw;
    private String name;
    private String phone_number;
}
