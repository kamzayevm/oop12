package src.RequestSystem;

import src.Enums.RequestStatus;
import src.Library.Librarian;
import src.UserSystem.Student;
import src.UserSystem.User;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Request implements Serializable {

    private User user;
    private String problem;
    private Date date;
    private RequestStatus status;
    private Librarian librarian;
    private Student student;

    public Request(User user, String problem, Date date, RequestStatus status) {
        this.user = user;
        this.problem = problem;
        this.date = date;
        this.status = status;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getProblem() {
        return problem;
    }

    public void setProblem(String problem) {
        this.problem = problem;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public RequestStatus getStatus() {
        return status;
    }

    public void setStatus(RequestStatus status) {
        this.status = status;
    }

    public Librarian getLibrarian() {
        return librarian;
    }

    public void setLibrarian(Librarian librarian) {
        this.librarian = librarian;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public void viewRequest() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
        System.out.println("Request by: " + user.getUsername());
        System.out.println("Date: " + dateFormat.format(date));
        System.out.println("Problem: " + problem);
        System.out.println("Status: " + status);
    }

    public void createRequest(User user, String problem) {
        this.user = user;
        this.problem = problem;
        this.date = new Date();
        this.status = RequestStatus.APPROVED;
        System.out.println("Request created successfully.");
    }

    public void deleteRequest() {
        this.user = null;
        this.problem = null;
        this.date = null;
        this.status = null;
        this.librarian = null;
        this.student = null;
        System.out.println("Request deleted successfully.");
    }
}
