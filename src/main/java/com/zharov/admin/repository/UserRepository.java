package com.zharov.admin.repository;

import com.zharov.admin.dto.UserNameDTO;
import com.zharov.admin.dto.UserRoleDTO;
import com.zharov.admin.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.NativeQuery;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface UserRepository extends JpaRepository<User,Long> {

    @Query (value = "SELECT u " +
            "FROM User u" +
            " WHERE :searchText is null or :searchText is not null and fts(u.searchTextVector, :searchText)")
    List<User> findUserAll(@Param("searchText") String searchText);

    /*
    @Query("SELECT new com.zharov.admin.dto.UserNameDTO(u.lastName, u.firstName, u.middleName) FROM User u")
    List<UserNameDTO> showAllUsers2();


    @Query("SELECT new com.zharov.admin.dto.UserRoleDTO(u.email, r.name) " +
            "FROM User u " +
            "JOIN u.userRoles ur " +
            "JOIN ur.role r")
    List<UserRoleDTO> showUserRoles();

    @Query("SELECT u FROM User u WHERE fts(u.searchTextVector, :searchText)")
    List<User> getUserList(String searchText);

    @Query (value = "SELECT * " +
            "FROM admin.User u" +
            " WHERE :searchText is null or :searchText is not null and u.search_text_vector @@ plainto_tsquery(:searchText)",
            nativeQuery = true)
    List<User> getUserList(@Param("searchText") String searchText);
*/


}
