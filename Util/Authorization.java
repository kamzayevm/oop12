package src.Util;

import src.Enums.Attendance;
import src.Enums.Role;
import src.Enums.UserRole;
import src.UserSystem.*;

import java.io.Serializable;
import java.util.Map;
import java.util.Objects;
import java.util.Scanner;

public class Authorization implements Serializable {
    private UserRole role;
    private database data;
    private ID_User idUser;

    public Authorization() {
        this.data = new database().getInstance();
        this.idUser = new ID_User();
    }

   

    public void viewMenu() {
        System.out.println("--- University System ---");
        while (true) {
            System.out.println("\nWelcome to the university system!");
            Viewable viewable = new Viewable();
            viewable.showMainMenu();

            System.out.print("Option: ");
            int command = getUserInputInt();

            if (command == 1) {
                System.out.print("Login: ");
                String login = getUserInputString();
                System.out.print("Password: ");
                String password = getUserInputString();
                User u = LoginToSystem(login, password);
                if (u == null) return;
                handleUserMenu(u);
            } else {
                return;
            }
        }
    }

    private void handleUserMenu(User user) {
        if (user instanceof Student) {
            handleStudent((Student) user);
        } else if (user instanceof Admin) {
            handleAdmin((Admin) user);
        } else if (user instanceof Teacher) {
            handleTeacher((Teacher) user);
        }
    }

    private void handleStudent(Student student) {
        while (true) {
            student.showStudentMenu();
            int option = getUserInputInt();
            if (option == 1) {
                changePassword(student);
            } else if (option == 4) {
                viewStudentCourses(student);
            } else if (option == 5) {
                viewStudentTranscript(student);
            } else if (option == 6) {
                LogoutFromSystem();
                break;
            } else {
                System.err.println("Error: wrong option");
            }
        }
    }

    

    private int getUserInputInt() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    private String getUserInputString() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

   
}
