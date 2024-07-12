package com.ohgiraffers.spring_project.sy.service;

import com.ohgiraffers.spring_project.sy.model.entity.MovieEntity;
import com.ohgiraffers.spring_project.sy.repository.MovieRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

@Service
public class MovieService {



    /*
        MovieEntity 엔티티 파일명 이렇게 해주면 좋고 바꿀꺼면 MovieEntity<<로 선언되어 있는 것을 엔티티 파일명으로 같게 바꿔줄것
    */



    private final MovieRepository movieRepository;

    public MovieService(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    public Page<MovieEntity> getMoviesByPage(int pageNumber, int pageSize) {
        return movieRepository.findAll(PageRequest.of(pageNumber, pageSize));
    }

}
