package com.example.demo.model;

import jakarta.persistence.*;

@Entity
@Table(name = "users_items")
public class UserItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    User user;

    @ManyToOne
    @JoinColumn(name = "item_id")
    Item item;
}
