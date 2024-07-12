package com.ohgiraffers.spring_project.sy.service;

import com.ohgiraffers.spring_project.sy.model.dto.SyDTO;
import com.ohgiraffers.spring_project.sy.model.entity.SyEntity;
import com.ohgiraffers.spring_project.sy.repository.SyRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class SyService {


    private final SyRepository syRepository;

    public SyService(SyRepository syRepository) {
        this.syRepository = syRepository;
    }

    public Page<SyEntity> getMoviesByPage(int pageNumber, int pageSize) {
        return syRepository.findAll(PageRequest.of(pageNumber, pageSize));
    }

    @Transactional
    public Long saveSy(SyDTO syDTO) {
        SyEntity syEntity = new SyEntity(syDTO.getTitle());
        return syRepository.save(syEntity).getId();
    }

}
