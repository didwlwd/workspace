package com.kh.board.model.vo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Reply {
	private int reply_No;
	private String reply_Content;
	private int ref_Bno;
	private int reply_Writer;
	private String create_Date;
	private String status;
	
	private String userId;
}
