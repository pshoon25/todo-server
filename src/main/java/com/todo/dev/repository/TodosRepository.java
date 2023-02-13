package com.todo.dev.repository;

import com.todo.dev.domain.entity.Todos;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface TodosRepository {

    Integer insert(Todos todosPost);

    Integer check(Integer id, Integer memberId);

    List<Todos> allTodos(Integer memberId);

    List<Todos> myTodos(Integer memberId);
}
