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
    public int boardCount() {
        return boardMapper.boardCount();
    }

    @Override
    public int insertBoard(Board board) {
        return boardMapper.insertBoard(board);
    }

    @Override
    public Board loadBoard(Long boardId) {
        return boardMapper.loadBoard(boardId);
    }

    @Override
    public int delete(Long boardId) {
        return boardMapper.delete(boardId);
    }

    @Override
    public int update(Board board) {
        return boardMapper.update(board);
    }
}
