package com.internship.crystal.model;

import jakarta.persistence.*;

@Entity
@Table(name = "users") // Good practice: name the table 'users'
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String username;

    @Column(nullable = false)
    private String passwordHash;

    // Standard empty constructor (Required by JPA)
    public User() {}

    // Getters and Setters (How other files read/write this data)
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getUsername() { return username; }
    public void setUsername(String username) { this.username = username; }

    public String getPasswordHash() { return passwordHash; }
    public void setPasswordHash(String passwordHash) { this.passwordHash = passwordHash; }
}
