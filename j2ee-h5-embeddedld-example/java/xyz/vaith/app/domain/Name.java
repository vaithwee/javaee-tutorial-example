package xyz.vaith.app.domain;

import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class Name implements Serializable {
    private String first;
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
        if (obj == this) {
            return true;
        }
        if (obj!= null && obj.getClass() == Name.class) {
            Name target = (Name)obj;
            return target.getLast().equals(this.last) && target.getFirst().equals(this.first);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.first.hashCode() + this.last.hashCode();
    }
}
