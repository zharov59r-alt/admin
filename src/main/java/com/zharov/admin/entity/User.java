package com.zharov.admin.entity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.BatchSize;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
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

    @Column(name = "user_middle_name", columnDefinition = "text")
    private String middleName;

    @OneToMany(mappedBy = "user")
    @BatchSize(size = 10)
    private List<UserRole> userRoles = new ArrayList<>();

 //   @Column(name = "creation_date", columnDefinition = "timestamp", nullable = false)
 //   private LocalDateTime creationDate;

    @Column(name = "search_text_vector", columnDefinition = "text", insertable = false, updatable = false)
    private String searchTextVector;

}
