package com.todo.dev.controller;

import com.todo.dev.domain.dto.Todos;
import com.todo.dev.domain.dto.TodosPost;
import com.todo.dev.domain.request.TodosPostRequest;
import com.todo.dev.domain.response.HomeTodosResponse;
import com.todo.dev.security.SecurityService;
import com.todo.dev.security.TokenRequired;
import com.todo.dev.service.TodosService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/todos")
@TokenRequired
@Slf4j
public class TodosController {

    private final TodosService todosService;
    private final SecurityService securityService;

    @PostMapping
    public Integer postTodos(@RequestBody TodosPostRequest request){
        Integer memberId = securityService.parseToken(securityService.getToken()).getId();
        log.info(memberId.toString());
        TodosPost todosPost = TodosPost
                .builder().member_id(memberId).content(request.getContent())
                .build();
        log.info(todosPost.toString());
        return todosService.insertTodoService(todosPost);
    }

    @PutMapping("/{id}")
    public Integer checkTodos(@PathVariable("id") Integer id){
        Integer member_id = securityService.parseToken(securityService.getToken()).getId();
        return todosService.checkTodo(id, member_id);
    }

    @GetMapping("/home") @TokenRequired
    public List<HomeTodosResponse> homeTodos(){
        return todosService.homeTodos(securityService.parseToken(securityService.getToken()).getId());
    }
}
