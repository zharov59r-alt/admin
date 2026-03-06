package com.zharov.admin.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.BatchSize;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Data
@NoArgsConstructor
@Entity
@Table(name = "user", schema = "admin")
@SequenceGenerator(name = "s_user_id", sequenceName = "s_user_id", allocationSize = 1)
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "s_user_id")
    @Column(name = "user_id", columnDefinition = "bigint")
    private Long id;

    @Column(name = "user_email", columnDefinition = "text", nullable = false, unique = true)
    private String email;

    @Column(name = "user_last_name", columnDefinition = "text", nullable = false)
    private String lastName;

    @Column(name = "user_first_name", columnDefinition = "text", nullable = false)
    private String firstName;

    @Column(name = "user_middle_name", columnDefinition = "text", nullable = false)
    private String middleName;

    @OneToMany(mappedBy = "user", fetch = FetchType.LAZY)
    @BatchSize(size = 10)
    private List<UserRole> userRoles = new ArrayList<>();

    @Column(name = "search_text_vector", columnDefinition = "text", insertable = false, updatable = false)
    private String searchTextVector;

}
