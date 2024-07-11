package com.ohgiraffers.spring_project.sy.repository;

import com.ohgiraffers.spring_project.sy.model.entity.SyEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SyRepository extends JpaRepository<SyEntity, Long> {
}