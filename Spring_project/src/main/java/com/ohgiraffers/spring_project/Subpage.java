package com.ohgiraffers.spring_project;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/page")
public class Subpage {

        @GetMapping("/subpage")
        public String subPage() {
            return "page/subpage";
        }
    }
