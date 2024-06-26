package com.ohgiraffers.spring_project;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {
    @GetMapping("/leePage")
    public String leePageRedirect() {
        return "page/Lee/Lee";
    }

    @GetMapping("/seungYeopPage")
    public String seungYeopPageRedirect() {
        return "page/seungYeop/SeungYeop";
    }

    @GetMapping("/Elemental")
    public String ElementalRedirect(){
        return "page/seungYeop/Elemental";
    }
}