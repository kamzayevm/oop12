package src.Researcher;

import src.UserSystem.Employee;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Researcher implements Comparable<Researcher>, Supervisor {
    private String name;
    private List<ResearchPaper> researchPapers;

    public Researcher(String name) {
        this.name = name;
    }

    public void addResearchPaper(ResearchPaper paper) {
        researchPapers.add(paper);
    }

    public void printPapers(Comparator<ResearchPaper> comparator) {
        researchPapers.sort(comparator);
        for (ResearchPaper paper : researchPapers) {
            System.out.println(paper);
        }
    }

    @Override
    public int compareTo(Researcher o) {
        return this.name.compareTo(o.name);
    }

    public int calculateHIndex() {
        researchPapers.sort(Comparator.comparingInt(ResearchPaper::getCitations).reversed());

        int hIndex = 0;
        for (int i = 0; i < researchPapers.size(); i++) {
            int citations = researchPapers.get(i).getCitations();
            if (citations >= i + 1) {
                hIndex = i + 1;
            } else {
                break;
            }
        }
        return hIndex;
    }

    @Override
    public void supervise() {
        // Logic for supervising research work
    }
}
