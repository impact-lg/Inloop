package Inloop.Exam.COOLIDEAS;

public abstract class JContent extends java.util.Observable {

    private String title;
    private String description;

    public JContent(String title, String description) {

        this.title = title;
        this.description = description;

    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public abstract String toString();

}
