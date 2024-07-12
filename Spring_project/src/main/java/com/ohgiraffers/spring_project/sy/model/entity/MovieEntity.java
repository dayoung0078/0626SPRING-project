package com.ohgiraffers.spring_project.sy.model.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class MovieEntity {
    @Id
    private int id;
}
