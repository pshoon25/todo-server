package com.todo.dev.domain.dto;

import lombok.*;

import java.time.LocalDateTime;

@Getter@Setter
@RequiredArgsConstructor
public class FriendsTodos {
    private final Integer id;
    private final LocalDateTime createDate;
    private final String name;
    private final String content;
}
