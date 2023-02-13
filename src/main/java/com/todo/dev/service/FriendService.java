package com.todo.dev.service;

import com.todo.dev.domain.entity.Friends;
import com.todo.dev.repository.FriendRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class FriendService {
    private FriendRepository friendRepository;

    public Integer insertFriend(Integer targetId, Integer myId){
        return friendRepository.insertFriends(targetId, myId);
    }
}
