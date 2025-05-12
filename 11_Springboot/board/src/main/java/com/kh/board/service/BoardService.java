package com.kh.board.service;

import com.kh.board.controller.dto.request.BoardRequset;
import com.kh.board.entity.Board;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public interface BoardService {
    List<Board> findAll();
    int boardCount();
    int insertBoard(Board board);

    Board loadBoard(Long boardId);

    int delete(Long boardId);
    int update(Board board);
}
