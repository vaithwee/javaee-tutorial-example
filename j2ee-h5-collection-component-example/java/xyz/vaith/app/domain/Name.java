package xyz.vaith.app.domain;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Name {
    @Column(name = "person_last_name")
    private String last;
    @Column(name = "person_first_name")
    private String first;

    public String getLast() {
        return last;
    }

    public void setLast(String last) {
        this.last = last;
    }

    public String getFirst() {
        return first;
    }

    public void setFirst(String first) {
        this.first = first;
    }

    public Name() {
    }

    public Name(String last, String first) {
        this.last = last;
        this.first = first;
    }

    @Override
    public String toString() {
        return "Name{" +
                "last='" + last + '\'' +
                ", first='" + first + '\'' +
                '}';
    }
}
