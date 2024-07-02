package com.ohgiraffers.spring_project.sy.service;

import com.ohgiraffers.spring_project.sy.repository.MovieRepository;
import org.springframework.stereotype.Service;

@Service
public class MovieService {
    private MovieRepository movieRepository;

    public MovieService(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
//        System.out.println("sedasd");
    }


}
