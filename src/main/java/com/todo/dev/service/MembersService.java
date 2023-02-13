package com.todo.dev.service;

import com.todo.dev.domain.entity.Members;
import com.todo.dev.domain.request.LoginRequest;
import com.todo.dev.domain.request.SignUpRequest;
import com.todo.dev.domain.response.MemberResponse;
import com.todo.dev.repository.MembersRepository;
import com.todo.dev.security.SecurityService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
@Slf4j
public class MembersService {
    private final MembersRepository membersRepository;
    private final SecurityService securityService;

    public MemberResponse loginService(LoginRequest request) {
        Members loginMember = membersRepository.findByIdAndPw(request);
        log.info(loginMember.toString());
        if (loginMember.getId() != null) {
            String token = securityService.createToken(loginMember);
            return new MemberResponse(
                    loginMember.getId(),
                    loginMember.getName(),
                    loginMember.getPhone_number(),
                    token
            );
        }
        log.info("end");
        return null;
    }


    public MemberResponse signUpService(SignUpRequest request){
        Integer insertId = membersRepository.insertMembers(request);
        if(insertId!=null){
            return loginService(new LoginRequest(request.getMember_id(), request.getMember_pw()));
        }
        return null;
    }


}
