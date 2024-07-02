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
                return "redirect:/seungYeopPage?pageNumber=" + pageNumber;
            }
            return "redirect:/seungYeopPage?pageNumber=1";
        }

        if (title.startsWith("다영님 페이지")) {
            String[] parts = title.split(" ");
            if (parts.length == 3) {
                String pageNumber = parts[2];
                return "redirect:/daYoungPage?pageNumber=" + pageNumber;
            }
            return "redirect:/daYoungPage?pageNumber=1";
        }

        if (title.startsWith("효주님 페이지")) {
            String[] parts = title.split(" ");
            if (parts.length == 3) {
                String pageNumber = parts[2];
                return "redirect:/hyoJooPage?pageNumber=" + pageNumber;
            }
            return "redirect:/hyoJooPage?pageNumber=1";
        }

        if (title.startsWith("재희님 페이지")) {
            String[] parts = title.split(" ");
            if (parts.length == 3) {
                String pageNumber = parts[2];
                return "redirect:/jaeHeePage?pageNumber=" + pageNumber;
            }
            return "redirect:/jaeHeePage?pageNumber=1";
        }

        if (title.startsWith("하영님 페이지")) {
            String[] parts = title.split(" ");
            if (parts.length == 3) {
                String pageNumber = parts[2];
                return "redirect:/haYoungPage?pageNumber=" + pageNumber;
            }
            return "redirect:/haYoungPage?pageNumber=1";
        }

        if (title.startsWith("은석 페이지")) {
            String[] parts = title.split(" ");
            if (parts.length == 3) {
                String pageNumber = parts[2];
                return "redirect:/eunSeokPage?pageNumber=" + pageNumber;
            }
            return "redirect:/eunSeokPage?pageNumber=1";
        }

        if (title.startsWith("민주님 페이지")) {
            String[] parts = title.split(" ");
            if (parts.length == 3) {
                String pageNumber = parts[2];
                return "redirect:/minJooPage?pageNumber=" + pageNumber;
            }
            return "redirect:/minJooPage?pageNumber=1";
        }

        return "redirect:/";
    }
}