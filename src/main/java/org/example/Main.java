package org.example;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        UserService userService = new UserService();
        List<User> users = new ArrayList<>();

        users.add(new User(User.UserRole.ADMIN, true, "email@email.com", "user1", 1));
        users.add(new User(User.UserRole.USER, false, "email@email.com", "user2", 2));
        users.add(new User(User.UserRole.ADMIN, true, "email@email.com", "user3", 3));
        users.add(new User(User.UserRole.USER, false, "email@email.com", "user4", 4));
        users.add(new User(User.UserRole.ADMIN, false, "email@email.com", "user5", 5));

        List<UserDTO> newList = userService.getActiveAdminUsers(users);
        for (UserDTO u : newList) {
            System.out.println(u.getUsername());
        }
    }

}