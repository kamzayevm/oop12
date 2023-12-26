package src.Courses;

import src.Enums.CourseType;
import src.Transcript.Mark;
import src.UserSystem.Student;
import src.UserSystem.Teacher;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Vector;

public class Course implements Serializable {

    private String courseName;
    private int creditsNumber;
    private Vector<Teacher> listOfInstructors;
    private String courseCode;
    private int maxStudentNumber;
    private CourseType courseType;
    private HashMap<Student, Mark> listOfStudent;
    private Teacher teacher;
    private Lesson lesson;
    private Schedule schedule;
    private Student student;

    public Course(String courseName, int creditsNumber) {
        this.courseName = courseName;
        this.creditsNumber = creditsNumber;
    }

    

    public void setListOfInstructors(Vector<Teacher> listOfInstructors) {
        this.listOfInstructors = listOfInstructors;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public void setMaxStudentNumber(int maxStudentNumber) {
        this.maxStudentNumber = maxStudentNumber;
    }

    public void setCourseType(CourseType courseType) {
        this.courseType = courseType;
    }

    public void setListOfStudent(HashMap<Student, Mark> listOfStudent) {
        this.listOfStudent = listOfStudent;
    }

    public void setSchedule(Schedule schedule) {
        this.schedule = schedule;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public void setLesson(Lesson lesson) {
        this.lesson = lesson;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    
    public String getCourseName() {
        return this.courseName;
    }

    public int getCreditsNumber() {
        return this.creditsNumber;
    }

    
    public String getName() {
        return courseName;
    }
}
