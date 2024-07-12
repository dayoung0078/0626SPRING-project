package com.ohgiraffers.spring_project.sy.repository;

import com.ohgiraffers.spring_project.sy.model.entity.MovieEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieRepository extends JpaRepository<MovieEntity, Long> {
}