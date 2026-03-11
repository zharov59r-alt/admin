package com.zharov.admin.service;

import com.zharov.admin.dto.*;
import com.zharov.admin.entity.User;
import com.zharov.admin.mapper.UserMapper;
import com.zharov.admin.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;
    private final UserMapper userMapper;

    public ResponseEntity<List<UserAllResponse>> findUserAll(UserAllRequest request) {
        //String searchText = request.getSearchText();
        List<User> users = userRepository.findUserAll("");
        List<UserAllResponse> userResponseList = userMapper.toUserResponseList(users);
        return ResponseEntity.ok(userResponseList);
    }

    /*
    public List<User> getUserList(UserListRequestDto request) {

        if (request.getSearchText() == null) {
            log.info("getSearchText is null");
        }

        //String searchText = request.getSearchText().replaceAll("[^\\p{IsAlphabetic}]", " ");
        return userRepository.getUserList(request.getSearchText());
    }


    public List<UserListDTOBack> showUserList() {
        return userRepository.findAll()
                .stream()
                .map(userMapper::toDto)
                .collect(toList());
    }


    public Map<String, List<UserRoleDTO>> showUserRole() {
        return userRepository.showUserRoles()
                .stream()
                .collect(Collectors.groupingBy(UserRoleDTO::getEmail));
    }



    public List<UserRoleDTO2> showUserRole() {
        List<UserRoleDTO> userRoleDTO = userRepository.showUserRoles();

        return userMapper.toDtoUserRole(userRoleDTO);
    }
     */
}
