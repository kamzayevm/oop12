package src.Researcher;

import java.util.Comparator;

public class CitationsComparator implements Comparator<ResearchPaper> {
    @Override
    public int compare(ResearchPaper paper1, ResearchPaper paper2) {
        int citations1 = paper1.getCitations();
        int citations2 = paper2.getCitations();

        if (citations1 > citations2) {
            return -1; 
        } else if (citations1 < citations2) {
            return 1;
        } else {
            return 0; 
        }
    }
}
