package com.kh.mybatis.board.model.vo;

import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Board {
	private int boardNo;
	private String boardTitle;
	private String boardContent;
	private int boradWriter;
	private int count;
	private Date createDate;
	private String status;
	
	private String userId;
}
