package com.todo.dev.repository;

import com.todo.dev.domain.dto.Todos;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TodosRepository {

    Integer insert(Todos todosPost);
}
