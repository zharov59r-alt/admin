package com.zharov.admin.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "role", schema = "admin")
@SequenceGenerator(name = "s_role_id", sequenceName = "s_role_id", allocationSize = 1)
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "s_role_id")
    @Column(name = "role_id", columnDefinition = "bigint")
    private Long id;

    @Column(name = "role_name", columnDefinition = "text", nullable = false, unique = true)
    private String name;

    @Column(name = "role_description", columnDefinition = "text", nullable = false)
    private String description;

    @OneToMany(mappedBy = "role")
    private Set<UserRole> userRoles = new HashSet<>();

}
