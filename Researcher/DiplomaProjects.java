package src.Researcher;

public class DiplomaProjects {
    private ResearchProject project;
    private GraduateStudent graduateStudent;

    public ResearchProject getProject() {
        return project;
    }

    public void setProject(ResearchProject project) {
        this.project = project;
    }

    public GraduateStudent getGraduateStudent() {
        return graduateStudent;
    }

    public void setGraduateStudent(GraduateStudent graduateStudent) {
        this.graduateStudent = graduateStudent;
    }

    public void publishProject() {
        if (project != null) {
            System.out.println("Project Published: " + project.getTopicName());
            if (graduateStudent != null) {
                graduateStudent.addPublishedProject(project);
            } else {
                System.out.println("No graduate student assigned.");
            }
        } else {
            System.out.println("No project to publish.");
        }
    }
}
