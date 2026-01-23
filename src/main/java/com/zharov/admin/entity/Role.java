package com.zharov.admin.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashSet;
import java.util.Set;

@Data
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
/*
    @OneToMany(mappedBy = "role", fetch = FetchType.LAZY)
    private Set<UserRole> userRoles = new HashSet<>();;
*/
}
