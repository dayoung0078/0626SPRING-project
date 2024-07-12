package com.ohgiraffers.spring_project.sy.controller;


import com.ohgiraffers.spring_project.sy.model.entity.SyEntity;
import com.ohgiraffers.spring_project.sy.service.SyService;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SyController {

    private final SyService syService;

    public SyController(SyService syService) {
        this.syService = syService;
    }

//    @GetMapping("/seungYeopPage")
//    public String SeungYeop(@RequestParam(defaultValue = "1") int pageNumber, Model model) {
//        int pageSize = 1; // 한 페이지에 하나의 영화만 표시
//        Page<SyEntity> moviePage = syService.getMoviesByPage(pageNumber, pageSize);
//        model.addAttribute("moviePage", moviePage);
//        return "page/SeungYeop/SeungYeop";
//    }

    @GetMapping("/test")
    public String test(){
        return "page/seungyeop/test";
    }


}
