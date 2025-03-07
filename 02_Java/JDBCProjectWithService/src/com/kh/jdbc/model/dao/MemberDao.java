package com.kh.jdbc.model.dao;


import static com.kh.common.JDBCTemplate.close;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.InvalidPropertiesFormatException;
import java.util.Properties;

import com.kh.jdbc.model.vo.Member;

/*
 * DAO(Data Access Object) : db 직접적으로 접근해서 사용자의 요청에 맞는 sql문 실행 후 결과 반환(JDBC)
 */
public class MemberDao {
	
	/*
	 * 사용자가 입력한 정보들을 db에 추가시켜주는 메서드
	 * Member m : 사용자가 입력한 값들이 담겨있는 Member객체
	 * insert실행 후 처리된 행 수 리턴
	 */
	private Properties prop = new Properties();
	
	
	public MemberDao() {
		super();
		try {
			prop.loadFromXML(new FileInputStream("resources/query.xml"));
		} catch (InvalidPropertiesFormatException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public int insertMember(Member m, Connection conn) {
//		JDBC 사용 순서
//		 * 1) JDBC Driver등록 : JDBC인터페이스가 특정 DBMS가 제공하는 클래스를 사용할 수 있도록 등록
//		 * 2) Connection 생성 : 연결하고자하는 db정보를 입력해서 해당 db와 연결할 수 있는 객체 생성
//		 * 3) Statement생성 : Connection객체를 이용해서 생성(sql문을 실행하고 결과를 받는 객체)
//		 * 4) sql문 전달해서 실행 : Statement객체를 이용해서 sql문 실행
//		 * 5) 결과받기 > SELECT문 실행(6-1)  => ResultSet객체(조회된 결과를 담아준다.), DML(INSERT, UPDATE, DELETE)문 실행(6-2) => int
//		 * 
//		 * 6-1) ResultSet객체에 담겨있는 데이터들을 하나씩 추출해서 차근차근 옯겨담기
//		 * 6-2) 트랜잭션 처리(성공했으면 commit, 실패했다면 rollback 실행)
//		 * 
//		 * 7) 다 사용한 JDBC객체를 반드시 자원 반납(close) => 생성된 역순으로
		
		//필요한 변수 세팅하기
		int result = 0;
		PreparedStatement pstmt = null;
		
		
		String sql = prop.getProperty("insertMember");
		
		try {
			pstmt = conn.prepareStatement(sql); //아직 미완성 sql문으로 ?를 전부 채워줘야한다.
			
			pstmt.setString(1, m.getUserid());
			pstmt.setString(2, m.getUserPwd());
			pstmt.setString(3, m.getUsername());
			pstmt.setString(4, m.getGender());
			pstmt.setInt(5, m.getAge());
			pstmt.setString(6, m.getEmail());
			pstmt.setString(7, m.getPhone());
			pstmt.setString(8, m.getAddress());
			pstmt.setString(9, m.getHobby());
			
			result = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			close(pstmt);
		}
		
		return result;
	}
	
	/*
	 * 회원목록을 반환하는 메서드
	 * ArrayList
	 */
	
	public ArrayList<Member> selectList(Connection conn) {
		//select문(여러행 조회) -> ResultSet -> ArrayList담기
		ResultSet rset = null;
		PreparedStatement pstmt = null;
		ArrayList<Member> list = new ArrayList<>();
		
		String sql = "SELECT * FROM MEMBER";
		
		try {
			pstmt = conn.prepareStatement(sql);
			rset = pstmt.executeQuery();
			
			while(rset.next()) {
				Member m = new Member();
				m.setUserno(rset.getInt("userno"));
				m.setUserid(rset.getString("userid"));
				m.setUserPwd(rset.getString("userPwd"));
				m.setUsername(rset.getString("username"));
				m.setGender(rset.getString("gender"));
				m.setAge(rset.getInt("age"));
				m.setEmail(rset.getString("email"));
				m.setPhone(rset.getString("phone"));
				m.setAddress(rset.getString("address"));
				m.setHobby(rset.getString("hobby"));
				m.setEnrolldate(rset.getDate("enrolldate"));
				list.add(m);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			close(rset);
			close(pstmt);
		}
		return list;
	}
	
	/**
	 * Member객체 m을 통해서 update sql을 전달하는 메서드
	 */
	public int updateMember(Member m, Connection conn) {
		//update문 -> 처리된 행 수 : int -> 트랜잭션
		int result = 0;
		PreparedStatement pstmt = null;
		
		String sql = "UPDATE MEMBER SET EMAIL = ?, PHONE = ?, ADDRESSS = ?, HOBBY =? WHERE USERID = ?";
		
		try {
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, m.getEmail());
			pstmt.setString(2, m.getPhone());
			pstmt.setString(3, m.getAddress());
			pstmt.setString(4, m.getHobby());
			pstmt.setString(5, m.getUserid());
			
			result = pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			close(pstmt);
		}
		return result;
	}

	
	//delete from MEMBER where userid = ?;
	public int deleteMember(String userid, Connection conn) {
		int result = 0;
		PreparedStatement pstmt = null;
		
		String sql = "delete from MEMBER where userid = ?";
		
		try {
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, userid);
			
			result = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			close(pstmt);
		}
		return result;
	}
	
	public ArrayList<Member> selectByUserName(String keyword, Connection conn){
		//select -> ResultSet -> ArrayList
		
		 ArrayList<Member> list = new ArrayList<>();
		 PreparedStatement pstmt = null;
		 ResultSet rset = null;
		 
		 String sql = "SELECT * FROM MEMBER WHERE USERNAME LIKE '%' || ? || '%'";
		 
		 try {
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, keyword);
			
			rset = pstmt.executeQuery();
			
			while(rset.next()) {
				Member m = new Member();
				m.setUserno(rset.getInt("userno"));
				m.setUserid(rset.getString("userid"));
				m.setUserPwd(rset.getString("userPwd"));
				m.setUsername(rset.getString("username"));
				m.setGender(rset.getString("gender"));
				m.setAge(rset.getInt("age"));
				m.setEmail(rset.getString("email"));
				m.setPhone(rset.getString("phone"));
				m.setAddress(rset.getString("address"));
				m.setHobby(rset.getString("hobby"));
				m.setEnrolldate(rset.getDate("enrolldate"));
				list.add(m);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			close(rset);
			close(pstmt);
		}
		
		return list;
	}
}
