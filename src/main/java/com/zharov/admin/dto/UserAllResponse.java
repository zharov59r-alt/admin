package com.zharov.admin.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class UserAllResponse {

    private String email;
    private String lastName;
    private String firstName;
    private String middleName;
}
