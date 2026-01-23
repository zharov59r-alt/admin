package com.zharov.admin.controller;

import com.zharov.admin.dto.UserListDTO;
import com.zharov.admin.entity.User;
import com.zharov.admin.mapper.UserMapper;
import com.zharov.admin.repository.UserRepository;
import com.zharov.admin.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class Controller {

    private final UserService userService;
    private final UserRepository userRepository;


    @GetMapping("/users")
    public List<User> showUserList() {
        return userRepository.findAll();
    }

    /*

    @GetMapping("/users")
    public List<UserListDTO> showUserList() {
        return userService.showUserList();
    }
*/

}
