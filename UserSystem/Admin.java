package src.UserSystem;

import src.Enums.Role;
import src.Util.Authorization;
import src.Util.Database;

import java.io.Serializable;

public class Admin extends Employee implements Serializable {

    private Database database;
    private Authorization authorization;

    public Admin(String username, String password) {
        super(username, password, 12000, 2);
    }

    public Database getDatabase() {
        return database;
    }

    public void setDatabase(Database database) {
        this.database = database;
    }

    public void addUser(String username, String password, Role role) throws Exception {
        User user = createNewUser(username, password, role);
        authorization.createUser(role, user);
    }

    private User createNewUser(String username, String password, Role role) {
        switch (role) {
            case ADMIN:
                return new Admin(username, password);
            case STUDENT:
                return new Student(username, password);
            case TEACHER:
                return new Teacher(username, password);
            default:
                return null;
        }
    }

    public void showAdminMenu() {
        displayUserMenu();
        System.out.println("3. View all users");
        System.out.println("4. Create  new user");
        System.out.println("5. Delete user");
        System.out.println("6. Logout");
    }

    private void displayUserMenu() {
        new Viewable().showUserMenu();
    }

    public Authorization getAuthorization() {
        return authorization;
    }

    public void setAuthorization(Authorization authorization) {
        this.authorization = authorization;
    }

    public void removeUser(String id, String username) {
        authorization.removeUser(id, username);
    }
}
