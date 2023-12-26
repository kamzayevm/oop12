package OOP.UniSystem;

import src.Courses.Course;
import src.Enums.Role;
import src.Enums.Schools;
import src.Transcript.Mark;

import src.UserSystem.Admin;
import src.UserSystem.User;

import src.UserSystem.Student;
import src.Util.Authorization;

import java.util.HashMap;

public class test {
    public static void main(String[] args) throws Exception {
        Authorization a = new Authorization();
        User admin = new Admin("Admin", "admin12");
        a.createUser(Role.ADMIN, admin);
        Student student = new Student("mubarak k", "kmd1212", Schools.SITE);
        Course course1 = new Course("OOP", 3);
        Course course2 = new Course("Algo", 3);

        Mark mark1 = new Mark(28, 30, 40);
        Mark mark2 = new Mark(24, 33, 40);
        HashMap<Course, Mark> courseMarkHashMap = new HashMap<>();
        courseMarkHashMap.put(course1, mark1);
        courseMarkHashMap.put(course2, mark2);
        Transcript t = new Transcript(courseMarkHashMap);
        student.setTranscript(t);
        a.createUser(Role.STUDENT, (User)student);
        a.createUser(Role.ADMIN, admin);
        a.viewMenu();
    }
}