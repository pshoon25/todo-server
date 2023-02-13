package com.todo.dev.domain.entity;

import lombok.*;

import java.time.LocalDateTime;

@Getter@Setter@ToString
@AllArgsConstructor@NoArgsConstructor
@Builder
public class Todos {
    private Integer id;
    private Integer member_id;
    private LocalDateTime create_date;
    private String content;
    private Boolean checked;
}
