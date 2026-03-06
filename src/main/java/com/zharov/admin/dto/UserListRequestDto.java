package com.zharov.admin.dto;


import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class UserListRequestDto {

    private String searchText;
    private List<String> roles;

}
