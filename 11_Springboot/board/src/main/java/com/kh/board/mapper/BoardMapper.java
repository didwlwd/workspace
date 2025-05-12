package com.kh.board.mapper;

import com.kh.board.controller.dto.request.BoardRequset;
import com.kh.board.entity.Board;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface BoardMapper {
 List<Board> findAll();
 int boardCount();
 int insertBoard(Board board);
 Board loadBoard(Long boardId);
 int delete(@Param("boardId")Long boardId);
 int update(Board board);
}
