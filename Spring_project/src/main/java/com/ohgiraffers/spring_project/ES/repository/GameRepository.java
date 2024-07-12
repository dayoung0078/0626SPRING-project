package com.ohgiraffers.spring_project.ES.repository;

import com.ohgiraffers.spring_project.ES.model.entity.GameEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface GameRepository extends JpaRepository<GameEntity, Long> {
}