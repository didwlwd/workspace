package f.object.ex1;
	/*
	 * 클래스의 구조
	 * 
	 * 접근제한자 class 클래스명{
	 * 		//필드영역(사용할 데이터를 선언하는 영역)
	 * 		
	 * 		//생성자영역(데이터를 초기화하기위한 특수목적의 메서드를 정의하는 영역)
	 * 
	 * 		//메소드영역(클래스의 기능을 정의하는 영역)
	 * }
	 */
public class Student {
	//핃드
	String name; //이름
	int age; //나이
	double height; //키
	
	public void myInfo() {
		int age = 20;
		System.out.println("안녕하세요. 저는 "  + this.age + "살의 " + this.name + "입니다.");
	}
	
	//메서드
	public static void main(String args) {
		//객체를 생성 할 때
		//class명 객체이름;
		
		Student choi;//choi라는 참조변수 생성)
		choi = new Student();
		
		Student kim = new Student();
		
		choi.name = "최지원";
		choi.age = 55;
		
		kim.name = "김지원";
		kim.age = 60;
		
		choi.myInfo();
		kim.myInfo();
	}
	
}
