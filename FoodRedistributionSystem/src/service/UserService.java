package service;

import model.User;
import model.Role;

import java.util.HashMap;
import java.util.Map;

/**
 * Service class for managing user-related operations.
 */
public class UserService {
    private Map<String, User> userDatabase =new HashMap<>();

    /**
     * Initializes the service with default users based on roles.
     */
    public UserService() {
        
        

        // Adding default users for each role
        addUser(new User(1, "Donor", "Donor", "Donor"));
        addUser(new User(2, "LogisticsManager", "LogisticsManager", "Logistics Manager"));
        addUser(new User(3, "Volunteer", "Volunteer", "Volunteer"));
        addUser(new User(4, "NGOCoordinator", "NGOCoordinator", "NGO Coordinator"));
        addUser(new User(5, "Educator", "Educator", "Educator"));
        addUser(new User(6, "FoodSafetyInspector", "FoodSafetyInspector", "Food Safety Inspector"));
        addUser(new User(7, "WarehouseManager", "WarehouseManager", "Warehouse Manager"));
        addUser(new User(8, "TransportDriver", "TransportDriver", "Transport Driver"));
        addUser(new User(9, "DonationScheduler", "DonationScheduler", "Donation Scheduler"));

    }

    /**
     * Adds a user to the user database.
     *
     * @param user The user to add.
     */
    private void addUser(User user) {
        userDatabase.put(user.getUsername(), user);
    }

    /**
     * Authenticates a user based on username and password.
     *
     * @param username The username of the user.
     * @param password The password of the user.
     * @return The authenticated user, or null if authentication fails.
     */
    public User authenticateUser(String username, String password) {
        User user = userDatabase.get(username);
        if (user != null && user.getPassword().equals(password)) {
            return user;
        }
        return null;
    }

    /**
     * Updates a user's information.
     *
     * @param user The user to update.
     * @return True if the update is successful, false otherwise.
     */
    public boolean updateUser(User user) {
        if (userDatabase.containsKey(user.getUsername())) {
            userDatabase.put(user.getUsername(), user);
            return true;
        }
        return false;
    }
}
