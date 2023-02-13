package com.todo.dev.domain.entity;

import lombok.*;

import java.time.LocalDateTime;
import java.time.LocalTime;

@Getter@Setter@ToString
@AllArgsConstructor@NoArgsConstructor
public class Friends {
    private Integer my_id;
    private Integer target_id;
    private LocalDateTime create_date;
}
