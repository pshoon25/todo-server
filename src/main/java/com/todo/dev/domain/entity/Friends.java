package com.todo.dev.domain.entity;

import lombok.*;

import java.time.LocalDateTime;

@Getter@Setter@ToString
@AllArgsConstructor@NoArgsConstructor
@Builder
public class Friends {
    private Integer myId;
    private Integer targetId;
    private LocalDateTime createDate;
}
