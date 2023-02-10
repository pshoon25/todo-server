package com.todo.dev.domain.request;

import lombok.*;

import java.time.LocalDateTime;

@Getter@Setter@ToString
@AllArgsConstructor@NoArgsConstructor
public class TodosPostRequest {
    private String content;
}
