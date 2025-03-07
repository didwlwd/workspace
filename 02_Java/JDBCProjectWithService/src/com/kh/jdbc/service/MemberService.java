package com.kh.jdbc.service;

import static com.kh.common.JDBCTemplate.close;
import static com.kh.common.JDBCTemplate.commit;
//static으로 import시 static 메서드를 직접 가져올 수 있음
import static com.kh.common.JDBCTemplate.getConnection;
import static com.kh.common.JDBCTemplate.rollback;

import java.sql.Connection;
import java.util.ArrayList;

import com.kh.jdbc.model.dao.MemberDao;
import com.kh.jdbc.model.vo.Member;

public class MemberService {
	//1) JDBC driver등록
	//2) Connection객체 생성
	//3) Connection객체 처리
	
	
	public int insertMember(Member m) {
		Connection conn = getConnection();
		int result = new MemberDao().insertMember(m, conn);
		
		if(result > 0) {
			commit(conn);
		}else {
			rollback(conn);
		}
		
		close(conn);
		
		return result;
	}
	
	public ArrayList<Member> selectList(){
		Connection conn = getConnection();
		ArrayList<Member> list = new MemberDao().selectList(conn);
		close(conn);
		return list;
	}
	
	public int updateMember(String userId, String email, String phone, String address, String hobby) {
		Connection conn = getConnection();
		Member m = new Member();
		m.setUserid(userId);
		m.setEmail(email);
		m.setPhone(phone);
		m.setAddress(address);
		m.setHobby(hobby);
		int result = new MemberDao().updateMember(m , conn);
		
		if(result > 0) {
			commit(conn);
		}else {
			rollback(conn);
		}
		
		close(conn);
		return result;
	}
	
	public int deleteMember(String userid) {
		Connection conn = getConnection();
		
		int result = new MemberDao().deleteMember(userid, conn);
		
		if(result > 0 ) {
			commit(conn);
		}else {
			rollback(conn);
		}
		
		close(conn);
		return result;
	}
	
	public ArrayList<Member> selectByUserName(String keyword) {
		Connection conn = getConnection();
		ArrayList<Member> list = new MemberDao().selectByUserName(keyword , conn);
		
		close(conn);
		return list;
	}
}
