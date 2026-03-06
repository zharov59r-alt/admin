package com.zharov.admin.controller;

import com.zharov.admin.dto.UserListRequestDto;
import com.zharov.admin.dto.UserRoleDTO2;
import com.zharov.admin.entity.User;
import com.zharov.admin.repository.UserRepository;
import com.zharov.admin.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
@RequiredArgsConstructor
public class Controller {

    private final UserService userService;
    private final UserRepository userRepository;


    /*
    @GetMapping("/userrole")
    public Map<String, List<UserRoleDTO>> showUserRole() {
        return userService.showUserRole();
    }
    */


    @PostMapping("/userlist")
    public List<User> getUserList(@RequestBody UserListRequestDto request) {

        return userService.getUserList(request);
    }


/*
    @GetMapping("/userrole")
    public List<UserRoleDTO2> showUserRole() {
        return userService.showUserRole();
    }

    @GetMapping("/usernames")
    public List<UserName> showUserNames() {
        return userRepository.findAllQweBy();
    }

    @GetMapping("/usernames2")
    public List<UserNameDTO> showUserNames2() {
        return userRepository.showAllUsers2();
    }



    @GetMapping("/users")
    public List<UserListDTO> showUserList() {
        return userService.showUserList();
    }

    */

}
