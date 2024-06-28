package com.ohgiraffers.spring_project;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PageControllerPath {
    @GetMapping("/navigate")
    public String navigate(@RequestParam String title) {
        if (title.startsWith("우승엽 페이지")) {
            String[] parts = title.split(" ");
            if (parts.length == 3) {
                String pageNumber = parts[2];
                return "redirect:/seungYeopPage" + pageNumber;
            }
            return "redirect:/seungYeopPage1";
        }

        switch (title) {
            case "다영님 페이지":
                return "redirect:/daYoungPage";
            case "효주님 페이지 1":
                return "redirect:/hyoJooPage";
            case "재희님 페이지 1":
                return "redirect:/jaeHeePage";
            case "하영님 페이지 1":
                return "redirect:/haYoungPage";
            case "은석 페이지":
                return "redirect:/eunSeokPage";
            case "민주님 페이지 1":
                return "redirect:/minJooPage";
            default:
                return "redirect:/";
        }
    }
}