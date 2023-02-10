package com.todo.dev.service;

import com.todo.dev.domain.dto.Todos;
import com.todo.dev.domain.dto.TodosPost;
import com.todo.dev.domain.request.TodosPostRequest;
import com.todo.dev.repository.TodosRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TodosService {
    private final TodosRepository todosRepository;

    public Integer insertTodoService(TodosPost todosPost){
        Todos dto = todosPost.toDTO();
        Integer insertRows = todosRepository.insert(dto);
        if(insertRows!=0){
            return dto.getId();
        }
        return 0;
    }
}
