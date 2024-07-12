package com.ohgiraffers.spring_project.sy.model.entity;


import jakarta.persistence.*;

@Entity
@Table(name = "sy_movie")
public class SyEntity {

    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "sy_title")
    private String title;

    public SyEntity() {
    }

    public SyEntity(String title) {
        this.id = id;
        this.title = title;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "SYEntity{" +
                "id=" + id +
                ", title='" + title + '\'' +
                '}';
    }
}
