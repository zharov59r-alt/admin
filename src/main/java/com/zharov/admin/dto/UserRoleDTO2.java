package com.zharov.admin.dto;

import com.zharov.admin.entity.UserRole;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class UserRoleDTO2 {

    private String email;
    private List<String> role;

}
