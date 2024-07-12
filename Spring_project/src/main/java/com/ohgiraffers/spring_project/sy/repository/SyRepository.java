package com.ohgiraffers.spring_project.sy.repository;

<<<<<<< HEAD:Spring_project/src/main/java/com/ohgiraffers/spring_project/sy/repository/MovieRepository.java
import com.ohgiraffers.spring_project.sy.model.entity.MovieEntity;
=======
import com.ohgiraffers.spring_project.sy.model.entity.SyEntity;
>>>>>>> 435a3cfd9aeaf54e0c7a13c109bdf3c426adce29:Spring_project/src/main/java/com/ohgiraffers/spring_project/sy/repository/SyRepository.java
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SyRepository extends JpaRepository<SyEntity, Long> {
}