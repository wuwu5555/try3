package com.entity;

import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.util.Objects;
@Component
@Entity
@Table(name = "news", schema = "zhanghuan")
public class NewsEntity {
    private String id;
    private String name;
    private String content;
    private String date;
    private String state;
    private String author;

    @Id
    @Column(name = "id", nullable = false, length = 45)
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Basic
    @Column(name = "name", nullable = true, length = 45)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "content", nullable = true, length = 1000)
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Basic
    @Column(name = "date", nullable = true, length = 100)
    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Basic
    @Column(name = "state", nullable = true, length = 10)
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Basic
    @Column(name = "author", nullable = true, length = 45)
    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NewsEntity that = (NewsEntity) o;
        return Objects.equals(id, that.id) && Objects.equals(name, that.name) && Objects.equals(content, that.content) && Objects.equals(date, that.date) && Objects.equals(state, that.state) && Objects.equals(author, that.author);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, name, content, date, state, author);
    }
}
