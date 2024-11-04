package org.example;

public class User {
    public int id;
    public String username;
    public String email;
    public boolean active; //??
    public UserRole role;

    public User(UserRole role, boolean active, String email, String username, int id) {
        this.role = role;
        this.active = active;
        this.email = email;
        this.username = username;
        this.id = id;
    }

    public boolean isActive(){
        return active;
    }

    public String getEmail() {
        return email;
    }

    public UserRole getRole() {
        return role;
    }

    public String getUsername() {
        return username;
    }

    public int getId(){
        return id;
    }

    public enum UserRole {
        ADMIN,
        USER,
    }
}
