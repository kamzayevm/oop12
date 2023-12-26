package src.UserSystem;

import src.Courses.Course;
import src.Enums.Attendance;
import src.Enums.TeacherRank;
import src.Journal.Journal;

import java.io.Serializable;
import java.util.Set;
import java.util.Vector;

public class Teacher extends Employee implements Serializable {

    private TeacherRank teacherType;
    private Vector<Course> coursesTaken;
    private Set<Journal> journal;

    public Teacher(String username, String password, int salary, int workExperience, TeacherRank teacherType) {
        super(username, password, salary, workExperience);
        this.teacherType = teacherType;
        this.coursesTaken = new Vector<>();
        this.journal = Set.of();
    }

    public Teacher(String username, String password) {
        super(username, password, 200000, 5);
    }

    public TeacherRank getTeacherType() {
        return teacherType;
    }

    public void setTeacherType(TeacherRank teacherType) {
        this.teacherType = teacherType;
    }

    public Vector<Course> getCoursesTaken() {
        return coursesTaken;
    }

    public void setCoursesTaken(Vector<Course> coursesTaken) {
        this.coursesTaken = coursesTaken;
    }

    public Set<Journal> getJournal() {
        return journal;
    }

    public void setJournal(Set<Journal> journal) {
        this.journal = journal;
    }

    public void showTeacherMenu() {
        // Display menu options for the teacher
    }

    public void viewJournal(String courseName) {
        Journal selectedJournal = findJournalForCourse(courseName);
        if (selectedJournal != null) {
            selectedJournal.viewJournal();
        } else {
            System.out.println("Journal for the selected course not found.");
        }
    }

    public void markAttendance(String courseName, Student student, Attendance attendance) {
        Journal selectedJournal = findJournalForCourse(courseName);
        if (selectedJournal != null) {
            selectedJournal.markAttendance(student, attendance);
        } else {
            System.out.println("Journal for the selected course not found.");
        }
    }

    public void gradeCourse(String courseName, Student student, double grade) {
        Journal selectedJournal = findJournalForCourse(courseName);
        if (selectedJournal != null) {
            selectedJournal.gradeCourse(student, grade);
        } else {
            System.out.println("Journal for the selected course not found.");
        }
    }

    private Journal findJournalForCourse(String courseName) {
        for (Journal journal : this.journal) {
            if (journal.getCourseName().equals(courseName)) {
                return journal;
            }
        }
        return null;
    }
}
