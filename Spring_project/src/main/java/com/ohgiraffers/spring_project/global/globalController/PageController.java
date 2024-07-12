package com.ohgiraffers.spring_project.global.globalController;

import com.ohgiraffers.spring_project.ES.service.GameService;
import com.ohgiraffers.spring_project.global.model.entity.Poster;
import com.ohgiraffers.spring_project.sy.model.entity.MovieEntity;
import com.ohgiraffers.spring_project.sy.service.MovieService;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Optional;

@Controller
public class PageController {

    private final MovieService movieService;
    private final PosterService posterService;

    public PageController(MovieService movieService, GameService gameService, PosterService posterService) {
        this.movieService = movieService;
        this.posterService = posterService;
    }

    @GetMapping("/index")
    public String index() {
        return "index";
    }

    @GetMapping("/subpage")
    public String subPage() {
        return "page/subpage";
    }

    // 각자의 페이지 1,2,3 별로 맞게 이동 코드

    @GetMapping("/navigate")
    public String navigate(@RequestParam String value) {
        if (value.startsWith("우승엽 페이지")) {
            String[] parts = value.split(" ");
            if (parts.length == 3) {
                String pageNumber = parts[2];
                return "redirect:/seungYeopPage?pageNumber=" + pageNumber;
            }
            return "redirect:/seungYeopPage?pageNumber=0";
        }
        if (value.startsWith("은석 페이지")) {
            String[] parts = value.split(" ");
            if (parts.length == 3) {
                String pageNumber = parts[2];
                return "redirect:/eunseok/eunSeokPage?pageNumber=" + pageNumber;
            }
            return "redirect:/eunseok/eunSeokPage?pageNumber=0";
        }
        if (value.startsWith("다영님 페이지")) {
            String[] parts = value.split(" ");
            if (parts.length == 3) {
                String pageNumber = parts[2];
                return "redirect:/daYoungPage?pageNumber=" + pageNumber;
            }
            return "redirect:/daYoungPage?pageNumber=0";
        }

        if (value.startsWith("재희님 페이지")) {
            String[] parts = value.split(" ");
            if (parts.length == 3) {
                String pageNumber = parts[2];
                return "redirect:/jaeHeePage?pageNumber=" + pageNumber;
            }
            return "redirect:/jaeHeePage?pageNumber=0";
        }

        if (value.startsWith("하영님 페이지")) {
            String[] parts = value.split(" ");
            if (parts.length == 3) {
                String pageNumber = parts[2];
                return "redirect:/haYoungPage?pageNumber=" + pageNumber;
            }
            return "redirect:/haYoungPage?pageNumber=0";
        }

        return "redirect:/";
    }

    @GetMapping("/seungYeopPage")
    public String SeungYeop(@RequestParam(defaultValue = "1") int pageNumber, Model model) {
        int pageSize = 1; // 한 페이지에 하나의 영화만 표시
        Page<MovieEntity> moviePage = movieService.getMoviesByPage(pageNumber, pageSize);
        model.addAttribute("moviePage", moviePage);
        return "page/SeungYeop/SeungYeop";
    }

    @GetMapping("/daYoungPage")
    public String DayoungPage() {
        return "page/Dayoung/Dayoung";
    }

    @GetMapping("/jaeHeePage")
    public String jaeHeePage() {
        return "page/jaeHeePage/jaeHeePage";
    }

    @GetMapping("/haYoungPage")
    public String haYoungPage() {
        return "page/haYoungPage/haYoungPage";
    }

    @GetMapping("/poster/{id}")

    @ResponseBody
    public Optional<Poster> getPosterById(@PathVariable Long id) {
        return posterService.getPosterById(id);
    }
}