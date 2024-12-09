package model;

/**
 * Represents a user in the system.
 */
public class User {
    private int userId; // Unique ID for the user
    private String username; // Username matching role name
    private String password; // Password based on the role pattern
    private String role; // Role of the user

    /**
     * Constructor for creating a User.
     *
     * @param userId   Unique identifier for the user.
     * @param username Username of the user (matches role name).
     * @param password Password for the user.
     * @param role     Role assigned to the user.
     */
    public User(int userId, String username, String password, String role) {
        this.userId = userId;
        this.username = username;
        this.password = password;
        this.role = role;
    }

    /**
     * Constructor for creating a User based on role.
     * Automatically assigns username and password based on role.
     *
     * @param userId Unique identifier for the user.
     * @param role   Role assigned to the user.
     */
    public User(String username, String role) {
        this.userId = userId;
        this.role = role;
        this.username = role; // Username matches the role
        this.password = role; // Default password pattern
    }

    // Getters and Setters

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", username='" + username + '\'' +
                ", role='" + role + '\'' +
                '}';
    }
}
