package com.zharov.admin.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.BatchSize;

@Data
@NoArgsConstructor
@Entity
@Table(name = "user_role_Link", schema = "admin")
@SequenceGenerator(name = "s_user_role_Link_id", sequenceName = "s_user_role_Link_id", allocationSize = 1)
public class UserRole {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "s_user_role_Link_id")
    @Column(name = "user_role_Link_id", columnDefinition = "bigint")
    private Long id;

    @JsonBackReference
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", referencedColumnName = "user_id", nullable = false)
    private User user;

    @JsonBackReference
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "role_id", referencedColumnName = "role_id", nullable = false)
    private Role role;

    @Override
    public String toString() {
        return "UserRole{" +
                "id=" + id +
                ", role='" + role.getName() + '\'' +
                '}';
    }

}
