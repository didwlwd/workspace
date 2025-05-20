package com.kh.jpa.service;

import com.kh.jpa.dto.BoardDto;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface BoardService {
    Page<BoardDto.Response> findAllBoards(Pageable pageable);
    BoardDto.Response findByIdBoard(Long id);
    Void deleteByIdBoard(Long id);
}
