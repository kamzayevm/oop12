package src.Courses;

import src.Enums.DayOfWeek;
import src.Enums.LessonType;
import src.UserSystem.Student;
import src.UserSystem.Teacher;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Lesson implements Serializable {

    private String courseName;
    private DayOfWeek day;
    private Teacher teacher;
    private int startTime;
    private LessonType type;
    private Course course;
    private Room room;
    private List<Student> enrolledStudents;

    public Lesson(String courseName, DayOfWeek day, int startTime, LessonType type) {
        this.courseName = courseName;
        this.day = day;
        this.startTime = startTime;
        this.type = type;
        this.enrolledStudents = new ArrayList<>();
    }

    public String getCourseName() {
        return this.courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public DayOfWeek getDay() {
        return this.day;
    }

    public void setDay(DayOfWeek day) {
        this.day = day;
    }

    public Teacher getTeacher() {
        return this.teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public int getStartTime() {
        return this.startTime;
    }

    public void setStartTime(int startTime) {
        this.startTime = startTime;
    }

    public LessonType getType() {
        return this.type;
    }

    public void setType(LessonType type) {
        this.type = type;
    }

    public Course getCourse() {
        return this.course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public Room getRoom() {
        return this.room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public void enrollStudent(Student student) {
        enrolledStudents.add(student);
    }

   
    public void removeStudent(Student student) {
        enrolledStudents.remove(student);
    }

    public List<Student> getEnrolledStudents() {
        return new ArrayList<>(enrolledStudents);
    }
\}
