package com.ohgiraffers.spring_project.ES.service;

import com.ohgiraffers.spring_project.ES.model.DTO.GameDTO;
import com.ohgiraffers.spring_project.ES.model.entity.GameEntity;
import com.ohgiraffers.spring_project.ES.repository.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class GameService {
    private final GameRepository gameRepository;

    @Autowired
    public GameService(GameRepository gameRepository) {
        this.gameRepository = gameRepository;
    }

    public Page<GameEntity> getGamesByPage(int pageNumber, int pageSize) {
        return gameRepository.findAll(PageRequest.of(pageNumber, pageSize));
    }

    public Optional<GameDTO> getGameById(Long id) {
        return gameRepository.findById(id).map(GameDTO::new);
    }

    public GameDTO saveGame(GameDTO gameDTO) {
        GameEntity gameEntity = gameDTO.toEntity();
        GameEntity savedEntity = gameRepository.save(gameEntity);
        return new GameDTO(savedEntity); // 저장된 엔티티를 DTO로 변환하여 반환
    }

    public void deleteGameById(Long id) {
        gameRepository.deleteById(id);
    }

    public int getPageNumberForGame(Long gameId, int pageSize) {
        long count = gameRepository.count();
        int totalPages = (int) Math.ceil((double) count / pageSize);
        for (int i = 0; i < totalPages; i++) {
            Page<GameEntity> page = gameRepository.findAll(PageRequest.of(i, pageSize));
            for (GameEntity game : page) {
                if (game.getId().equals(gameId)) {
                    return i + 1; // 페이지 번호는 1부터 시작
                }
            }
        }
        return 1; // 기본 페이지 번호
    }
}