package org.example;

public class UserDTO {
    private int id;
    private String username;
    private String email;

    public UserDTO(int id, String username, String email){
        this.id = id;
        this.username = username;
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public int getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }
}
