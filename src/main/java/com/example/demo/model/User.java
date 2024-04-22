package com.example.demo.model;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.List;

@Entity
@Table(name = "users")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @Column(unique = true, nullable = false)
    String email;

    @Column(unique = true, nullable = false)
    String username;

    @Column(nullable = false)
    String password;

    @OneToMany(mappedBy = "user")
    List<Account> accounts;

    // Many-To-Many (1-st option)
    @ManyToMany(mappedBy = "users")
    List<Product> products;

    // Many-To-Many (2-nd option)
    @OneToMany(mappedBy = "user")
    List<UserItem> items;
}
