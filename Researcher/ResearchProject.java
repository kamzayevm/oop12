package src.Researcher;

import java.util.ArrayList;
import java.util.List;

public class ResearchProject {
    private String topicName;
    private List<ResearchPaper> publishedPapers;
    private List<Researcher> participants;

    public ResearchProject(String topicName) {
        this.topicName = topicName;
        this.publishedPapers = new ArrayList<>();
        this.participants = new ArrayList<>();
    }

    public String getTopicName() {
        return topicName;
    }

    public void setTopicName(String topicName) {
        this.topicName = topicName;
    }

    public List<ResearchPaper> getPublishedPapers() {
        return publishedPapers;
    }

    public void setPublishedPapers(ResearchPaper paper) {
        this.publishedPapers.add(paper);
    }

    public List<Researcher> getParticipants() {
        return participants;
    }

    public void addParticipant(Researcher researcher) throws CustomException {
        if (!(researcher instanceof Researcher)) {
            throw new CustomException("Only researchers can participate in the project.");
        }
        participants.add(researcher);
    }
}
