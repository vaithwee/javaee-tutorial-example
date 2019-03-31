package xyz.vaith.app.domain;

import javafx.scene.chart.Axis;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Data {
    private int age;
//    private StoneAxe axe;
    private List school;
    private Map scores;
    private Set axes;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }



    public List getSchool() {
        return school;
    }

    public Map getScores() {
        return scores;
    }

    public Set getAxes() {
        return axes;
    }

    public void setSchool(List school) {
        this.school = school;
    }

    public void setScores(Map scores) {
        this.scores = scores;
    }

    public void setAxes(Set axes) {
        this.axes = axes;
    }

    public void useAxe() {
        System.out.println(school);
        System.out.println(scores);
        System.out.println(axes);
    }
}
