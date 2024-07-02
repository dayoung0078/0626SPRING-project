package com.ohgiraffers.spring_project.sy.repository;

import com.ohgiraffers.spring_project.sy.model.entity.MovieEntity;
import org.springframework.data.jpa.repository.JpaRepository;


public interface MovieRepository extends JpaRepository<MovieEntity, Long> {



}
