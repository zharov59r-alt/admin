package com.zharov.admin.service;

import com.zharov.admin.dto.UserListDTOBack;
import com.zharov.admin.dto.UserListRequestDto;
import com.zharov.admin.dto.UserRoleDTO;
import com.zharov.admin.dto.UserRoleDTO2;
import com.zharov.admin.entity.User;
import com.zharov.admin.mapper.UserMapper;
import com.zharov.admin.repository.UserRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.random.RandomGenerator;

import static java.util.stream.Collectors.toList;

@Slf4j
@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;
    private final UserMapper userMapper;

    public List<User> getUserList(UserListRequestDto request) {

        if (request.getSearchText() == null) {
            log.info("getSearchText is null");
        }

        //String searchText = request.getSearchText().replaceAll("[^\\p{IsAlphabetic}]", " ");
        return userRepository.getUserList(request.getSearchText());
    }

    /*
    public List<UserListDTOBack> showUserList() {
        return userRepository.findAll()
                .stream()
                .map(userMapper::toDto)
                .collect(toList());
    }

    /*
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
