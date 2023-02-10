package com.todo.dev.domain.dto;

import lombok.*;

@Getter@Setter@ToString
@AllArgsConstructor@NoArgsConstructor
public class Members {
    private Integer id;
    private String member_id;
    private String member_pw;
    private String name;
    private String phone_number;
}
