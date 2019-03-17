package xyz.vaith.app.domain;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Score {
    @Column(name = "score_level")
    private String level;

    @Column(name = "score_mark")
    private Float score;


    public Score() {
    }

    public Score(String level, Float score) {
        this.level = level;
        this.score = score;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public Float getScore() {
        return score;
    }

    public void setScore(Float score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Score{" +
                "level='" + level + '\'' +
                ", score=" + score +
                '}';
    }
}
