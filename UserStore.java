import java.util.ArrayList;
import java.util.List;
 
// UserStore acts as a simple in-memory "database"
// It holds all registered users as a static list so every class can access it
public class UserStore {
 
    // A simple class representing one registered user
    public static class User {
        public String firstName;
        public String lastName;
        public String email;
        public String username;
        public String password;
 
        public User(String firstName, String lastName, String email, String username, String password) {
            this.firstName = firstName;
            this.lastName  = lastName;
            this.email     = email;
            this.username  = username;
            this.password  = password;
        }
 
        // Helper: returns "First Last"
        public String getFullName() {
            return firstName + " " + lastName;
        }
    }
 
    // The list that stores all registered users during the program's lifetime
    private static final List<User> users = new ArrayList<>();
 
    // Called by Registration.java after successful validation
    public static void addUser(User user) {
        users.add(user);
    }
 
    // Called by Login.java to verify credentials
    // Returns the matching User object, or null if not found
    public static User findUser(String username, String password) {
        for (User u : users) {
            if (u.username.equals(username) && u.password.equals(password)) {
                return u;
            }
        }
        return null;
    }
 
    // Called by Login.java to check if a username already exists (for registration)
    public static boolean usernameExists(String username) {
        for (User u : users) {
            if (u.username.equals(username)) {
                return true;
            }
        }
        return false;
    }
    
    // Called by Dashboard.java when the user deletes their account
    public static void removeUser(String username) {
        users.removeIf(u -> u.username.equals(username));
    }
    
    // Called by Dashboard.java when the user edits their profile
    public static void updateUser(String username, String newFirstName, String newLastName, String newEmail) {
        for (User u : users) {
            if (u.username.equals(username)) {
                u.firstName = newFirstName;
                u.lastName  = newLastName;
                u.email     = newEmail;
                break;
            }
        }
    }
    
    // Called by Dashboard.java when the user changes their password
    public static void updatePassword(String username, String newPassword) {
        for (User u : users) {
            if (u.username.equals(username)) {
                u.password = newPassword;
                break;
            }
        }
    }
}
