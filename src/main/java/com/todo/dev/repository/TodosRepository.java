package com.todo.dev.repository;

import com.todo.dev.domain.dto.Todos;
import com.todo.dev.domain.response.HomeTodosResponse;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface TodosRepository {

    Integer insert(Todos todosPost);

    Integer check(Integer id, Integer member_id);

    List<Todos> allTodos(Integer member_id);
}
