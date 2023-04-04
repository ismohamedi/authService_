package com.example.authservice_.user;

import jakarta.persistence.*;

import java.time.LocalDate;
@Entity
@Table
public class User {
    @Id
    @SequenceGenerator(
            name = "user_sequence",
            sequenceName = "user_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "user_sequence"
    )
    private Long id;
    private String username;
    private String firstName;
    private String surName;
    private String email;
    private  Integer phoneNumber;
    private Integer age;
    private LocalDate dob;
    private String password;

    public User() {
    }

    public User(Long id,
                String username,
                String firstName,
                String surName,
                String email,
                Integer phoneNumber,
                Integer age,
                LocalDate dob,
                String password) {
        this.id = id;
        this.username = username;
        this.firstName = firstName;
        this.surName = surName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.age = age;
        this.dob = dob;
        this.password = password;
    }

    public User(String username,
                String firstName,
                String surName,
                String email,
                Integer phoneNumber,
                Integer age,
                LocalDate dob,
                String password) {
        this.username = username;
        this.firstName = firstName;
        this.surName = surName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.age = age;
        this.dob = dob;
        this.password = password;
    }

    public Long getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSurName() {
        return surName;
    }

    public String getEmail() {
        return email;
    }

    public Integer getPhoneNumber() {
        return phoneNumber;
    }

    public Integer getAge() {
        return age;
    }

    public LocalDate getDob() {
        return dob;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", firstName='" + firstName + '\'' +
                ", surName='" + surName + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", age=" + age +
                ", dob=" + dob +
                ", password='" + password + '\'' +
                '}';
    }
}
