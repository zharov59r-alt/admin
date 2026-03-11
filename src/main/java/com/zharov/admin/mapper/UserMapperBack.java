package com.zharov.admin.mapper;

import com.zharov.admin.dto.UserListDTOBack;
import com.zharov.admin.dto.UserRoleDTO;
import com.zharov.admin.dto.UserRoleDTO2;
import com.zharov.admin.entity.User;
import com.zharov.admin.entity.UserRole;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.*;

@Slf4j
@Component
public class UserMapperBack {

    /*
    public UserListDTOBack toDto(User user) {
        String email = user.getEmail();
        List<UserRole> roles = user.getUserRoles();

        log.info(roles.toString());

        return new UserListDTOBack(email, roles);

    }

    public List<UserRoleDTO2> toDtoUserRole(List<UserRoleDTO> userRoleDTO) {

        List<UserRoleDTO2>  userRoleDTO2List = new ArrayList<>();
        Map<String, List<String>> userRoleDTOMap = new HashMap<>();

        for (UserRoleDTO elem : userRoleDTO) {
            String email = elem.getEmail();
            String role = elem.getRole();

            if (!userRoleDTOMap.containsKey(email)) {
                userRoleDTOMap.put(email, new ArrayList<>(Arrays.asList(role)));
            } else {
                userRoleDTOMap.get(email).add(role);
            }
        }

        for (Map.Entry<String, List<String>> entry : userRoleDTOMap.entrySet()) {
            userRoleDTO2List.add(new UserRoleDTO2(entry.getKey(), entry.getValue()));
        }

        return userRoleDTO2List;

    }
*/

}
