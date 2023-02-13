package com.todo.dev.controller;

import com.todo.dev.domain.entity.Friends;
import com.todo.dev.security.SecurityService;
import com.todo.dev.service.FriendService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/friends")
public class FriendsController {
    private final SecurityService securityService;
    private final FriendService friendService;

    @PostMapping("/{targetId}")
    public Integer insertFriend(@PathVariable("targetId") Integer targetId){
        Integer myId = securityService.parseToken(securityService.getToken()).getId();
        return friendService.insertFriend(targetId, myId);
    }

}
