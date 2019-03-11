package xyz.vaith.app.domain;

import javax.persistence.*;

@Entity
@Table(name = "news_inf")
public class News {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "news_title", length = 50)
    private String title;
    private String content;
//    @Enumerated(EnumType.ORDINAL)
    @Enumerated(EnumType.STRING)
    @Column(name = "happen_season")
    private Season happenSeason;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Season getHappenSeason() {
        return happenSeason;
    }

    public void setHappenSeason(Season happenSeason) {
        this.happenSeason = happenSeason;
    }
}
