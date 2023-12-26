package src.Researcher;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ResearchPaper {

    private String title;
    private List<String> authors;
    private int pages;
    private Date date;
    private String doi;
    private int citations;

    public ResearchPaper(String title, List<String> authors, int pages, Date date, String doi, int citations) {
        this.title = title;
        this.authors = authors;
        this.pages = pages;
        this.date = date;
        this.doi = doi;
        this.citations = citations;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<String> getAuthors() {
        return authors;
    }

    public void setAuthors(List<String> authors) {
        this.authors = authors;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getDoi() {
        return doi;
    }

    public void setDoi(String doi) {
        this.doi = doi;
    }

    public int getCitations() {
        return citations;
    }

    public void setCitations(int citations) {
        this.citations = citations;
    }

   
    public void addCitation() {
        citations++;
    }

    
    public void addAuthor(String author) {
        if (authors == null) {
            authors = new ArrayList<>();
        }
        authors.add(author);
    }


    public void removeAuthor(String author) {
        if (authors != null) {
            authors.remove(author);
        }
    }
}
