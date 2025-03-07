package com.kh.mybatis.board.service;

import java.util.ArrayList;
import java.util.HashMap;

import com.kh.mybatis.board.model.vo.Board;
import com.kh.mybatis.common.PageInfo;

public interface BoardService {
	public int selectListCount();
	public ArrayList<Board> selectList(PageInfo p);
	public int selectSearchCount(HashMap<String, String> map);
	public ArrayList<Board> selectSearchList(HashMap<String, String> map,PageInfo pi);
}
