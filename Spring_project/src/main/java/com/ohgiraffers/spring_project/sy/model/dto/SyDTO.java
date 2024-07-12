package com.ohgiraffers.spring_project.sy.model.dto;

import com.ohgiraffers.spring_project.sy.model.entity.SyEntity;

public class SyDTO {

    private String title;

    public SyDTO() {
    }

    public SyEntity toSyEntity() {
        return new SyEntity(title);
    }

    public SyDTO(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "SYDTO{" +
                "title='" + title + '\'' +
                '}';
    }
}
