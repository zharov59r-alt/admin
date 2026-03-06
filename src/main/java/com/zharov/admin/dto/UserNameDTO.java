package com.zharov.admin.dto;

import com.zharov.admin.entity.UserRole;
import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class UserNameDTO {

    private String lastName;
    private String firstName;
    private String middleName;

}
