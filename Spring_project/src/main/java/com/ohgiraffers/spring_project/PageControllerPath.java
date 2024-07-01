package com.ohgiraffers.spring_project;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PageControllerPath {
    @GetMapping("/navigate")
    public String navigate(@RequestParam String title)     {
        if (title.startsWith("우승엽 페이지")) {
            String[] parts = title.split(" ");
            if (parts.length == 3) {
                String pageNumber = parts[2];
                return "redirect:/seungYeopPage" + pageNumber;
            }
            return "redirect:/seungYeopPage1";
        }

        if (title.startsWith("다영님 페이지")) {
            String[] parts = title.split(" ");
            if (parts.length == 3) {
                String pageNumber = parts[2];
                return "redirect:/daYoungPage" + pageNumber;
            }
            return "redirect:/daYoungPage1";
        }

        if (title.startsWith("효주님 페이지")) {
            String[] parts = title.split(" ");
            if (parts.length == 3) {
                String pageNumber = parts[2];
                return "redirect:/hyoJooPage" + pageNumber;
            }
            return "redirect:/hyoJooPage1";
        }

        if (title.startsWith("재희님 페이지")) {
            String[] parts = title.split(" ");
            if (parts.length == 3) {
                String pageNumber = parts[2];
                return "redirect:/jaeHeePage" + pageNumber;
            }
            return "redirect:/jaeHeePage1";
        }

        if (title.startsWith("하영님 페이지")) {
            String[] parts = title.split(" ");
            if (parts.length == 3) {
                String pageNumber = parts[2];
                return "redirect:/blog/haYoungPage" + pageNumber;
            }
            return "redirect:/blog/haYoungPage1";
        }

        if (title.startsWith("은석 페이지")) {
            String[] parts = title.split(" ");
            if (parts.length == 3) {
                String pageNumber = parts[2];
                return "redirect:/blog/eunSeokPage" + pageNumber;
            }
            return "redirect:/blog/eunSeokPage1";
        }

        if (title.startsWith("민주님 페이지")) {
            String[] parts = title.split(" ");
            if (parts.length == 3) {
                String pageNumber = parts[2];
                return "redirect:/blog/minJooPage" + pageNumber;
            }
            return "redirect:/blog/minJooPage1";
        }
        return "redirect:/";
    }
}