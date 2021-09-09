package com.example.demo;


import javax.persistence.*;
import java.util.*;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String alias;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String description;

    @ManyToMany(fetch = FetchType.EAGER)
    private Map<Long, User> friends = new HashMap<>();
    @ManyToMany(fetch = FetchType.EAGER)
    private Map<Long, User> friendRequests = new HashMap<>();
    @ManyToMany(fetch = FetchType.EAGER)
    private Map<Long, Badge> badges = new HashMap<>();


    public User () {
    }

    public User(Long id, String alias, String firstName, String lastName, String password, String email) {
        this.id = id;
        this.alias = alias;
        this.firstName = firstName;
        this.lastName = lastName;
        this.password = password;
        this.email = email;

    }

    public Map<Long, User> getFriendRequests() {
        return friendRequests;
    }

    public void setFriendRequests(Map<Long, User> friendRequests) {
        this.friendRequests = friendRequests;
    }

    public Map<Long, User> getFriends() {
        return friends;
    }

    public void setFriends(Map<Long, User> friends) {
        this.friends = friends;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Map<Long, Badge> getBadges() {
        return badges;
    }

    public void setBadges(Map<Long, Badge> badges) {
        this.badges = badges;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
