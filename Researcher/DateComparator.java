package src.Researcher;

import java.util.Comparator;

public class DateComparator implements Comparator<ResearchPaper> {
    @Override
    public int compare(ResearchPaper paper1, ResearchPaper paper2) {
        if (paper1.getDate().isAfter(paper2.getDate())) {
            return -1;
        } else if (paper1.getDate().isBefore(paper2.getDate())) {
            return 1;
        } else {
            return 0;
        }
    }
}
