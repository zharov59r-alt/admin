package com.zharov.admin.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class UserAllResponse {

    private String email;
    private String lastName;
    private String firstName;
    private String middleName;
}
