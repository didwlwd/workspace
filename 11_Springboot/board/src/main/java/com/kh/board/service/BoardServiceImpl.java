package com.kh.board.service;

import com.kh.board.controller.dto.request.BoardRequset;
import com.kh.board.entity.Board;
import com.kh.board.mapper.BoardMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class BoardServiceImpl implements BoardService {

    private final BoardMapper boardMapper;

    @Override
    public List<Board> findAll() {

        return boardMapper.findAll();
    }

    @Override
    public int insertBoard(Board board, String file) {
        int boardCount = boardMapper.boardCount();
        int count = boardCount + 1;
        Long boardId = Long.valueOf(count);
        return boardMapper.insertBoard(BoardRequset.CreateDTO.insert(board,boardId),boardId,file);
    }
}
