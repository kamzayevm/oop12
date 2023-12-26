package src.Researcher;

import src.UserSystem.User;

import java.util.ArrayList;
import java.util.List;

public class GraduateStudent extends User {
    private int hIndex;
    private List<ResearchProject> publishedProjects = new ArrayList<>();

    public GraduateStudent(String username, String password) {
        super(username, password);
    }

    public GraduateStudent(String username, String password, int hIndex) {
        super(username, password);
        this.hIndex = hIndex;
    }

    public void addPublishedProject(ResearchProject project) {
        publishedProjects.add(project);
    }

    public List<ResearchProject> getPublishedProjects() {
        return publishedProjects;
    }

    public int getHIndex() {
        return hIndex;
    }

    public void setHIndex(int hIndex) {
        this.hIndex = hIndex;
    }
}
