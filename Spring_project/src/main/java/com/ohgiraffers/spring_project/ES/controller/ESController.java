package com.ohgiraffers.spring_project.ES.controller;

import com.ohgiraffers.spring_project.ES.model.DTO.GameDTO;
import com.ohgiraffers.spring_project.ES.service.GameService;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.UUID;

@Controller
@RequestMapping("/eunseok")
public class ESController {

    private final GameService gameService;
    private final ResourceLoader resourceLoader;

    @Autowired
    public ESController(GameService gameService, ResourceLoader resourceLoader) {
        this.gameService = gameService;
        this.resourceLoader = resourceLoader;
    }

    @GetMapping("/eunSeokPage")
    public String eunSeokPage(@RequestParam(defaultValue = "1") int pageNumber, Model model) {
        int pageSize = 1; // 한 페이지에 하나의 게임만 표시
        Page<GameDTO> gamePage = gameService.getGamesByPage(pageNumber - 1, pageSize).map(GameDTO::new);
        model.addAttribute("gamePage", gamePage);
        return "page/lee/Lee";
    }

    @GetMapping("/game/{id}")
    public String getGame(@PathVariable Long id, @RequestParam(defaultValue = "1") int pageNumber, Model model, HttpServletRequest request) {
        GameDTO game = gameService.getGameById(id).orElseThrow(() -> new IllegalArgumentException("Invalid game Id:" + id));
        model.addAttribute("game", game);
        model.addAttribute("pageNumber", pageNumber);

        // 세션에 이전 URL 저장
        HttpSession session = request.getSession();
        session.setAttribute("previousUrl", request.getHeader("Referer"));

        return "page/lee/edit";
    }

    @GetMapping("/game/new")
    public String newGameForm(Model model) {
        model.addAttribute("game", new GameDTO());
        return "page/lee/new";
    }

    @PostMapping("/game/new")
    public String saveNewGame(@ModelAttribute GameDTO game, @RequestParam("imageFile") MultipartFile imageFile, Model model) {
        if (!imageFile.isEmpty()) {
            try {
                // 파일 저장 경로 설정
                Resource resource = resourceLoader.getResource("classpath:static/img/single");

                String filePath = null;

                // 만약 해당 경로가 없다면
                if (!resource.exists()) {
                    String root = "src/main/resources/static/img/single";
                    File file = new File(root);

                    file.mkdirs();
                    filePath = file.getAbsolutePath();
                } else {
                    filePath = resourceLoader.getResource("classpath:static/img/single").getFile().getAbsolutePath();
                }

                String originFileName = imageFile.getOriginalFilename();
                String ext = originFileName.substring(originFileName.lastIndexOf("."));
                String saveName = UUID.randomUUID().toString().replace("-", "") + ext;

                // 파일 저장
                imageFile.transferTo(new File(filePath + "/" + saveName));

                // 저장된 파일의 URL을 게임 DTO에 설정
                game.setEsimageurl("/img/single/" + saveName);
            } catch (IOException e) {
                e.printStackTrace();
                // 파일 저장 실패 시 처리
                model.addAttribute("message", "파일 업로드 실패");
                return "error";
            }
        }

        GameDTO savedGame = gameService.saveGame(game); // 저장된 게임 반환
        int pageSize = 1; // 한 페이지에 하나의 게임만 표시
        int pageNumber = gameService.getPageNumberForGame(savedGame.getId(), pageSize);
        return "redirect:/eunseok/eunSeokPage?pageNumber=" + pageNumber; // 새롭게 추가된 페이지로 리다이렉트
    }

    @PostMapping("/game/edit")
    public String saveEditedGame(@ModelAttribute GameDTO game, @RequestParam("imageFile") MultipartFile imageFile, HttpSession session, Model model) {
        if (!imageFile.isEmpty()) {
            try {
                // 파일 저장 경로 설정
                Resource resource = resourceLoader.getResource("classpath:static/img/single");

                String filePath = null;

                // 만약 해당 경로가 없다면
                if (!resource.exists()) {
                    String root = "src/main/resources/static/img/single";
                    File file = new File(root);

                    file.mkdirs();
                    filePath = file.getAbsolutePath();
                } else {
                    filePath = resourceLoader.getResource("classpath:static/img/single").getFile().getAbsolutePath();
                }

                String originFileName = imageFile.getOriginalFilename();
                String ext = originFileName.substring(originFileName.lastIndexOf("."));
                String saveName = UUID.randomUUID().toString().replace("-", "") + ext;

                // 파일 저장
                imageFile.transferTo(new File(filePath + "/" + saveName));

                // 저장된 파일의 URL을 게임 DTO에 설정
                game.setEsimageurl("/img/single/" + saveName);
            } catch (IOException e) {
                e.printStackTrace();
                // 파일 저장 실패 시 처리
                model.addAttribute("message", "파일 업로드 실패");
                return "error";
            }
        }

        gameService.saveGame(game); // 저장된 게임 반환

        // 세션에서 이전 URL 가져오기
        String previousUrl = (String) session.getAttribute("previousUrl");
        if (previousUrl != null) {
            session.removeAttribute("previousUrl"); // 세션에서 제거
            return "redirect:" + previousUrl; // 이전 URL로 리다이렉트
        } else {
            return "redirect:/eunseok/eunSeokPage"; // 기본 페이지로 리다이렉트
        }
    }

    @PostMapping("/game/{id}/delete")
    public String deleteGame(@PathVariable Long id, Model model) {
        gameService.deleteGameById(id);
        model.addAttribute("message", "삭제된 페이지입니다.");
        return "page/lee/deleted";
    }
}