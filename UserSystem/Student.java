package src.UserSystem;

import src.Enums.Degree;
import src.Enums.Schools;
import src.RequestSystem.Request;
import src.Transcript.Mark;
import src.Transcript.Transcript;
import src.Courses.Course;
import src.Journal.Journal;
import src.Library.Book;
import src.Courses.Schedule;

import java.io.Serializable;
import java.util.*;

public class Student extends User implements Serializable {
    private Vector<Course> courses;
    private Degree studentType;
    private Schools facultyName;
    private int year;
    private Transcript transcript;
    private Set<Request> request;
    private Set<Journal> journal;
    private Schedule schedule;

    public Student(String username, String password, Schools facultyName) {
        super(username, password);
        this.facultyName = facultyName;
    }

    public Student(String username, String password) {
        super(username, password);
    }

    // Getters and setters for various attributes

    public void showStudentMenu() {
        super.showUserMenu();
        System.out.println("3. Student's schedule.");
        System.out.println("4. Student's courses.");
        System.out.println("5. Student's transcript.");
        System.out.println("6. Logout.");
    }

    public void viewTranscript() {
        
    }

    public void viewCourses() {
        
    }

    public void chooseCourse() {
        
    }

    private void viewJournal(Course selectedCourse) {
        
    }

    public double viewGPA() {
       
        return 0.0;
    }

    public boolean addDrop() {
        
        return false;
    }

    public boolean registerForCourses() {
        
        return false;
    }

    public void displaySchedule() {
        
    }

    public void receiveBook(Book book) {
       
    }
}
