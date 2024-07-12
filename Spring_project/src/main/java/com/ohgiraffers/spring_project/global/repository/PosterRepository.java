package com.ohgiraffers.spring_project.global.repository;


import com.ohgiraffers.spring_project.global.model.entity.Poster;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PosterRepository extends JpaRepository<Poster, Long> {
    List<Poster> findByCategoryAndType(String category, String type);
}