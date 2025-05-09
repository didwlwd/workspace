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
 int insertBoard( BoardRequset.CreateDTO dto, @Param("boardId") long boardId, String file);
}
