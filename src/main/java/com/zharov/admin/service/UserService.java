package com.zharov.admin.service;

import com.zharov.admin.dto.UserListDTO;
import com.zharov.admin.mapper.UserMapper;
import com.zharov.admin.repository.UserRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

import static java.util.stream.Collectors.toList;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;
    private final UserMapper userMapper;

    @Transactional
    public List<UserListDTO> showUserList() {
        return userRepository.findAll()
                .stream()
                .map(userMapper::toDto)
                .collect(toList());
    }


}
