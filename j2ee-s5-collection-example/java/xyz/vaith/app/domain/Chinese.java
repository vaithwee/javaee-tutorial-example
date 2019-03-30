package xyz.vaith.app.domain;

import java.util.*;

public class Chinese implements Person {
    private List<String> schools;
    private Map scores;
    private Map<String, Axe> phaseAxes;
    private Properties health;
    private Set axes;
    private String[] books;

    public void setSchools(List<String> schools) {
        this.schools = schools;
    }

    public void setScores(Map scores) {
        this.scores = scores;
    }

    public void setPhaseAxes(Map<String, Axe> phaseAxes) {
        this.phaseAxes = phaseAxes;
    }

    public void setHealth(Properties health) {
        this.health = health;
    }

    public void setAxes(Set axes) {
        this.axes = axes;
    }

    public void setBooks(String[] books) {
        this.books = books;
    }

    @Override
    public void useAxe() {

    }

    @Override
    public String toString() {
        return "Chinese{" +
                "schools=" + schools +
                ", scores=" + scores +
                ", phaseAxes=" + phaseAxes +
                ", health=" + health +
                ", axes=" + axes +
                ", books=" + Arrays.toString(books) +
                '}';
    }
}
