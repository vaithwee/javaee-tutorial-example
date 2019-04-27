package xyz.vaith.app.domain;

import java.io.Serializable;
import java.util.List;

public class CheckBox implements Serializable {
    private boolean reader;
    private List<String> courses;

    public CheckBox() {
        super();
    }

    public boolean isReader() {
        return reader;
    }

    public void setReader(boolean reader) {
        this.reader = reader;
    }

    public List<String> getCourses() {
        return courses;
    }

    public void setCourses(List<String> courses) {
        this.courses = courses;
    }

    @Override
    public String toString() {
        return "CheckBox{" +
                "reader=" + reader +
                ", courses=" + courses +
                '}';
    }
}
