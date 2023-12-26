package src.Courses;

import src.Enums.DayOfWeek;
import src.UserSystem.Student;
import src.UserSystem.Teacher;

import java.io.Serializable;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Schedule implements Serializable {

    private String scheduleID;
    private Map<Date, Course> coursesByDate;
    private Teacher teacher;
    private Set<Course> courses;
    private Student student;

    public String getScheduleID() {
        return this.scheduleID;
    }

    public void setScheduleID(String scheduleID) {
        this.scheduleID = scheduleID;
    }

    public Map<Date, Course> getCoursesByDate() {
        if (this.coursesByDate == null) {
            this.coursesByDate = new HashMap<>();
        }
        return this.coursesByDate;
    }

    public void setCoursesByDate(Map<Date, Course> coursesByDate) {
        this.coursesByDate = coursesByDate;
    }

    public Teacher getTeacher() {
        return this.teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public Student getStudent() {
        return this.student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Set<Course> getCourses() {
        if (this.courses == null) {
            this.courses = new HashSet<>();
        }
        return this.courses;
    }

    public void setCourses(Set<Course> courses) {
        this.courses = courses;
    }
}
