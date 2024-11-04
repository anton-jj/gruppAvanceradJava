package org.example;

import java.util.ArrayList;
import java.util.List;

public class UserService {
    public List<UserDTO> getActiveAdminUsers(List<User> users) {
        List<UserDTO> result = new ArrayList<>();
        return users.stream()
                .filter(user -> user.isActive() && user.getRole() == User.UserRole.ADMIN)
                .map(this::convertToDTO)
                .toList();
    }

    private UserDTO convertToDTO(User user) {
        return new UserDTO(user.getId(), user.getUsername(), user.getEmail());
    }
}
