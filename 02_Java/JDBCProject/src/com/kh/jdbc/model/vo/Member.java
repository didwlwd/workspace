package com.kh.jdbc.model.vo;

import java.sql.Date;

/*
 * VO(Value Object)
 * DB의 테이블 정보를 Java에서 사용하기위해 담아주는 객체
 * 한명의 회원(db 테이블의 한 행의 데이터)에 대한 데이터를 기록할 수 있는 저장용 객체
 */
public class Member {
	private int userno;
	private String userid;
	private String userPwd;
	private String username;
	private String gender;
	private int age;
	private String email;
	private String phone;
	private String address;
	private String hobby;
	private Date enrolldate;
	
	public Member() {
		super();
	}

	public Member(int userno, String userid, String userPwd, String username, String gender, int age, String email,
			String phone, String address, String hobby, Date enrolldate) {
		super();
		this.userno = userno;
		this.userid = userid;
		this.userPwd = userPwd;
		this.username = username;
		this.gender = gender;
		this.age = age;
		this.email = email;
		this.phone = phone;
		this.address = address;
		this.hobby = hobby;
		this.enrolldate = enrolldate;
	}

	public Member(String userid, String userPwd, String username, String gender, int age, String email, String phone,
			String address, String hobby) {
		super();
		this.userid = userid;
		this.userPwd = userPwd;
		this.username = username;
		this.gender = gender;
		this.age = age;
		this.email = email;
		this.phone = phone;
		this.address = address;
		this.hobby = hobby;
	}

	public int getUserno() {
		return userno;
	}

	public void setUserno(int userno) {
		this.userno = userno;
	}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getUserPwd() {
		return userPwd;
	}

	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getHobby() {
		return hobby;
	}

	public void setHobby(String hobby) {
		this.hobby = hobby;
	}

	public Date getEnrolldate() {
		return enrolldate;
	}

	public void setEnrolldate(Date enrolldate) {
		this.enrolldate = enrolldate;
	}

	@Override
	public String toString() {
		return userno + ", " + userid + ", " + userPwd + ", " + username
				+ ", " + gender + ", " + age + ", " + email + ", " + phone + ", "
				+ address + ", " + hobby + ", " + enrolldate;
	}
	
	
	
}
