package xyz.vaith.app.domain;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Name {
    @Column(name = "person_first_name", length = 100)
    private String first;

    @Column(name = "person_last_name", length = 100)
    private String last;

    public Name() {
    }

    public Name(String first, String last) {
        this.first = first;
        this.last = last;
    }

    public String getFirst() {
        return first;
    }

    public void setFirst(String first) {
        this.first = first;
    }

    public String getLast() {
        return last;
    }

    public void setLast(String last) {
        this.last = last;
    }

    @Override
    public String toString() {
        return "Name{" +
                "first='" + first + '\'' +
                ", last='" + last + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj!= null && obj.getClass()==Name.class) {
            Name target = (Name)obj;
            return target.getFirst().equals(this.first) && target.getLast().equals(this.last);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.first.hashCode() + this.last.hashCode();
    }
}
