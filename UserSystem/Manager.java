package src.UserSystem;

import src.Enums.ManagerType;
import src.Enums.Schools;
import src.RequestSystem.Request;

import java.util.Queue;

public class Manager extends Employee implements ManageRequest {

    private Queue<Request> listOfRequestsOR;
    private Schools faculty;
    private Queue<Request> listOfRequestsFaculty;
    private ManagerType managerType;

    public Manager(String username, String password, int salary, int workExperience, Schools faculty, ManagerType managerType) {
        super(username, password, salary, workExperience);
        this.faculty = faculty;
        this.managerType = managerType;
    }

   

    
    public boolean addTeacherToCourse(Teacher teacher, Course course) {
        
        if (course != null && teacher != null) {
            course.addTeacher(teacher);
            return true;
        }
        return false;
    }

    
    public boolean createNews(String title, String content) {
        if (title != null && content != null && !title.isEmpty() && !content.isEmpty()) {
            News news = new News(title, content);
           
            return true;
        }
        return false;
    }

    

}
