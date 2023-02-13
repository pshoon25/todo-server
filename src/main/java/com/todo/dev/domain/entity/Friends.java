package com.todo.dev.domain.entity;

import lombok.*;

import java.time.LocalDateTime;

@Getter@Setter@ToString
@AllArgsConstructor@NoArgsConstructor
public class Friends {
    private Integer myId;
    private Integer targetId;
    private LocalDateTime createDate;
}
