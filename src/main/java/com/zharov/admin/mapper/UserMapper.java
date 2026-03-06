package com.zharov.admin.mapper;

import com.zharov.admin.dto.UserAllResponse;
import com.zharov.admin.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

import java.util.List;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface UserMapper {
    UserAllResponse toUserAllResponse(User user);
    List<UserAllResponse> toUserResponseList(List<User> users);
}
