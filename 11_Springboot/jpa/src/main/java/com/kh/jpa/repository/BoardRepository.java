package com.kh.jpa.repository;

import com.kh.jpa.dto.BoardDto;
import com.kh.jpa.entity.Board;
import com.kh.jpa.enums.CommonEnums;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

public interface BoardRepository {
    Page<Board> findByStatus(CommonEnums.Status status, Pageable pageable);
    Optional<Board> findByIdBoard(Long id);
    void deleteByIdBoard(Board board);
    Long save(Board board);
}
