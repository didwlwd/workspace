package com.kh.board.service;

import com.kh.board.entity.Board;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public interface BoardService {
    List<Board> findAll();
    int insertBoard(Board board, String file);
}
