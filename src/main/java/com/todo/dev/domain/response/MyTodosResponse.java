package com.todo.dev.domain.response;

import com.todo.dev.domain.entity.Todos;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Getter
@NoArgsConstructor
public class MyTodosResponse {
    private Integer id;
    private LocalDateTime create_date;
    private String content;
    private boolean checked;
    public MyTodosResponse(Todos todos){
        this.id = todos.getId();
        this.create_date = todos.getCreate_date();
        this.content = todos.getContent();
        this.checked = todos.getChecked();
    }

}
