package src.News;

import src.UserSystem.User;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;

public class News implements Serializable {

    private String title;
    private String content;
    private User user;
    private Date postDate;

    public News(String title, String content, User user, Date postDate) {
        this.title = title;
        this.content = content;
        this.user = user;
        this.postDate = postDate;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Date getPostDate() {
        return postDate;
    }

    public void setPostDate(Date postDate) {
        this.postDate = postDate;
    }

    public void displayNews() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
        System.out.println("Title: " + title);
        System.out.println("Content: " + content);
        System.out.println("Posted by: " + user.getUsername());
        System.out.println("Post Date: " + dateFormat.format(postDate));
    }

    @Override
    public String toString() {
        return "News{" +
                "title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", user=" + user +
                ", postDate=" + postDate +
                '}';
    }
}
