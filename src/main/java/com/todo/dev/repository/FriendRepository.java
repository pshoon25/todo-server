package com.todo.dev.repository;

import com.todo.dev.domain.entity.Friends;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface FriendRepository {
    Integer insertFriends(Integer targetId, Integer myId);
}
