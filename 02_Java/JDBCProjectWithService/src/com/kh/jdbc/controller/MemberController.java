package com.kh.jdbc.controller;

import java.util.ArrayList;

import com.kh.jdbc.model.vo.Member;
import com.kh.jdbc.service.MemberService;
import com.kh.jdbc.view.MemberMenu;

/*
 * Controller : View를 통해서 사용자가 요청한 기능에 대해 처리하는 객체
 * 				해당 메서드로 전달된 데이터[가공 처리후] Dao로 전달하여 호출
 * 				Dao로부터 반환받은 결과에 따라서 성공 / 실패 여부를 판단하여 응답화면 결정 -> view메서드 호출 
 */

public class MemberController {
	MemberService ms = new MemberService();
	
	/**
	 * 사용자의 추가 요청을 처리하는 메서드
	 * userId ~ hobby : 사용자가 입력한 정보들을 매게변수로 받음
	 */
	public void insertMenu(String userid, String userPwd, String username, String gender, String age, String email,
			String phone, String address, String hobby) {
		//view로부터 전달받은 값을 바로 dao쪽으로 전달x
		//vo 객체에 담아서 service로 전달
		
		Member m = new Member( userid,userPwd, username, gender,
				Integer.parseInt(age), email, phone,  address,  hobby);
		int result = ms.insertMember(m);
		if(result > 0) {
			new MemberMenu().displaySuccess("회원 추가 성공");
		}else {
			new MemberMenu().displayFail("회원 추가 실패");
		}
	}
	
	/**
	 * 회원을 모두 조회하는 메서드
	 */
	
	public void selectList() {
		ArrayList<Member> list = ms.selectList();
		
		if(list.isEmpty()) {
			new MemberMenu().displayNoData("전체 조회 결과가 없습니다.");
		}else {
			new MemberMenu().displayMemberList(list);
		}
	}
	
	/**
	 * id로 이메일, 전화번호, 주소, 취미를 전달받아
	 * Member를 수정하는 메서드
	 */
	public void updateMember(String userId, String email, String phone, String address, String hobby) {
		int result = ms.updateMember(userId, email, phone, address, hobby);
		
		if(result > 0) {
			new MemberMenu().displaySuccess("성공적으로 회원정보가 변경되었습니다.");
		}else {
			new MemberMenu().displayFail("회원정보를 변경하는데 실패했습니다.");
		}
	}
	
	/**
	 * 아이디를 조회하여 회원을 삭제하는 메서드
	 */
	public void deleteMember(String userid) {
		int result = ms.deleteMember(userid);
		
		if(result > 0) {
			new MemberMenu().displaySuccess("성공적으로 회원 정보를 삭제하였습니다.");
		}else {
			new MemberMenu().displayFail("회원정보를 삭제하는데 실패했습니다.");
		}
	}
	
	/**
	 * 이름으로 키워드 검색요청처리
	 * keyword : 사용자가 입력한 검색 키워드
	 */
	public void selectByUserName(String keyword) {
		ArrayList<Member> list = ms.selectByUserName(keyword);
		
		if(list.isEmpty()) {
			new MemberMenu().displayNoData(keyword  +"에 해당하는 검색 결과가 없습니다.");
		}else {
			new MemberMenu().displayMemberList(list);
		}
	}
}
