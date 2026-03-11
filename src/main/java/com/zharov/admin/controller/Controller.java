package com.zharov.admin.controller;

import com.zharov.admin.dto.UserAllRequest;
import com.zharov.admin.dto.UserAllResponse;
import com.zharov.admin.entity.User;
import com.zharov.admin.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class Controller {

    private final UserService userService;

    @PostMapping("/users")
    public ResponseEntity<List<UserAllResponse>> findUserAll(@RequestBody(required = false) UserAllRequest request) {
        return userService.findUserAll(request);
    }




    /*
    @GetMapping("/userrole")
    public Map<String, List<UserRoleDTO>> showUserRole() {
        return userService.showUserRole();
    }
    */




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
