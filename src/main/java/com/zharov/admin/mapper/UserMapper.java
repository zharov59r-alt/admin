package com.zharov.admin.mapper;

import com.zharov.admin.dto.UserListDTO;
import com.zharov.admin.entity.User;
import com.zharov.admin.entity.UserRole;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Set;

@Component
public class UserMapper {

    public UserListDTO toDto(User user) {
        String email = user.getEmail();
        List<UserRole> roles = user.getUserRoles();

        return new UserListDTO(email, roles);


    }

}
