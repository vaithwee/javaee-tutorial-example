package xyz.vaith.app.domain;

import org.hibernate.annotations.Formula;

import javax.persistence.*;

@Entity
@Table(name = "news_inf")
public class News {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer id;
    private String title;
    private String content;
    @Formula("(select concat(nt.title, nt.content) from news_inf nt where nt.id= id)")
    private String fullContent;

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

    public String getFullContent() {
        return fullContent;
    }

    public void setFullContent(String fullContent) {
        this.fullContent = fullContent;
    }
}
