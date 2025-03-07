package z.practice_object.ex1;

public class Member {
	/*
	1. id, pwd, name, phone, email, age, gender(남, 여) 를 필드로 가지고있는 Member클래스 정의하기
	2. 기본생성자와 아이디, 비밀번호, 이름을 넘겨받아 초기화하는 생성자 정의
	3. 나머지정보를 초기화해주는 메서드 setInfo정의, 모든 정보를 서술해서 출력해주는 toInfo이라는 메서드를 정의
	4. 실행을 담당하는 Run클래스를 만들고 내부에서 임의에 데이터를 통해 3개의 객체를 만들고 toInfo메서드를 통해 정보를 출력
	*/
	
	String id;
	String pwd;
	String name;
	String phone;
	String email;
	int age;
	char gender;
	
	public Member(String id, String pwd, String name) {
		this.id = id;
		this.pwd = pwd;
		this.name = name;
	}
	
	public void setInfo(String phone, String email, int age, char gender) {
		this.phone = phone;
		this.email = email;
		this.age = age;
		this.gender = gender;
	}
	
	public void toInfo() {
		System.out.println("id : " + this.id);
		System.out.println("pwd : " + this.pwd);
		System.out.println("name : " + this.name);
		System.out.println("phone : " + this.phone);
		System.out.println("email : " + this.email);
		System.out.println("age : " + this.age);
		System.out.println("gender : " + this.gender);
	}
}
