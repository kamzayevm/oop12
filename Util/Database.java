package src.Util;

import src.Courses.Course;
import src.Library.Book;
import src.News.News;
import src.RequestSystem.Request;
import src.UserSystem.User;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Vector;

public class Database implements Serializable {

    private static Database instance;
    private boolean isRegistration;
    private HashMap<String, User> listOfUsers;
    private Vector<News> listOfNews;
    private Vector<Book> listOfBooks;
    private Vector<Request> listOfRequests;

    private Database() {
        listOfBooks = new Vector<>();
        listOfNews = new Vector<>();
        listOfUsers = new HashMap<>();
        saveDatabase();
    }

    public static Database getInstance() {
        if (instance == null) {
            instance = new Database();
        }
        return instance;
    }

  
    public boolean isRegistrationEnabled() {
        return this.isRegistration;
    }

    public void setRegistration(boolean isRegistration) {
        this.isRegistration = isRegistration;
    }

    public HashMap<String, User> getListOfUsers() {
        return this.listOfUsers;
    }

    public void setListOfUsers(HashMap<String, User> listOfUsers) {
        this.listOfUsers = listOfUsers;
    }

    public Vector<News> getListOfNews() {
        return this.listOfNews;
    }

    public void setListOfNews(Vector<News> listOfNews) {
        this.listOfNews = listOfNews;
    }

    public Vector<Book> getListOfBooks() {
        return this.listOfBooks;
    }

    public void setListOfBooks(Vector<Book> listOfBooks) {
        this.listOfBooks = listOfBooks;
    }

    public Vector<Request> getListOfRequests() {
        return this.listOfRequests;
    }

    public void setListOfRequests(Vector<Request> listOfRequests) {
        this.listOfRequests = listOfRequests;
    }

    

    public void readDatabase() {
        
    }

    public void saveDatabase() {
        
    }

    public void saveNews() {
        
    }

    public void saveUser(String id, User u) {
        listOfUsers.put(id, u);
    }

    public String getNews() {
      
        return "";
    }

    public String getBooks() {
        
        return "";
    }

    public void saveBooks() {
        
    }

    public Vector<Course> getActiveCourses() {
        
        return null;
    }

    public boolean isCourseAvailable() {
     
        return false;
    }

    public boolean registerForCourse() {
        
        return false;
    }

    public void loadNews() {
       
    }
}
