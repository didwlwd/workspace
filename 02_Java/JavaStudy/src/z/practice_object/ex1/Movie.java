package z.practice_object.ex1;

/*
	1. 영화관프로그램을 만들기위해 Movie클래스를 정의하려고한다. 직접 Movie클래스에 들어갈 값들을 추상화해서 필드와 메서드를 정의해본다.
	2. 이외에 영화관에서 사용할 수 있는 객체를 생각해보고 2개를 더 만들고 필드와 메서드를 구성해보자.
*/

public class Movie {
	String movie_name; //영화이름
	String date; //상영날짜
	String location; //영화관장소
	int num; //남은자리
	String room; //상영관
	
	String id; //아이디
	String pwd; //패스워드
	String phone; //전화번호
	String name; //본인이름
	String register_num; //주민번호
	
	public Movie() {
		
	}
	
	//로그인
	public void login(String id, String pwd) {
		if(this.id == id && this.pwd == pwd) {
			System.out.println("로그인 되었습니다.");	
		}else {
			System.out.println("잘못입력하셨습니다.");
		}
	}
	
	//회원가입
	public void join_member(String id, String pwd, String phone, String name, String register_num) {
		
		System.out.println("ID : " +id);
		this.id = id;
		
		System.out.println("PWD : " +pwd);
		this.pwd = pwd;
		
		System.out.println("PHONE : " +phone);
		this.phone = phone;
		
		System.out.println("NAME : " +name);
		this.name = name;
		
		System.out.println("REGISTER_NUM : " +register_num);
		this.register_num = register_num;
		
	}
}
