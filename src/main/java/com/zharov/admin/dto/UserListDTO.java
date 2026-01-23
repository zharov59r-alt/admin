package com.zharov.admin.dto;

import com.zharov.admin.entity.UserRole;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;
import java.util.Set;

@Data
@AllArgsConstructor
public class UserListDTO {

    private String email;
    private List<UserRole> roles;

}
