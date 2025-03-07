package h.override;

public class Run {

	public static void main(String[] args) {
		/*
		 * 참조변수를 호출하면 자동으로 .toString()이 호출된다.
		 * 
		 * 오버라이딩 전 : Object 클래스의 toString()실행 -> 클래스명 + @ + 객체의 주소를 암호화한 16진수값
		 * 오버라이딩 후 : Man클래스의(자식클래스)의 toString()을 실행
		 * 
		 * * 오버라이딩
		 * -> 자식클래스가 상속받고있는 부모 클래스의 메서드를 재정의 하는것
		 * -> 부모가 제공하는 메서드를 자식이 일부 고쳐서 사용하겠다는 의미
		 * 
		 * *오버라이딩의 성립조건
		 * -부모메서드명과 메서드형이 동일
		 * -매개변수의 갯수, 자료형, 순서 동일
		 * -반환형도 동일
		 * -부모메서드의 접근제한자보다 범위가 길거나 커야한다.
		 */
		Man m = new Man("양동민");
		String str = new String("안녕");
		Man m2 = null;
		
		System.out.println(m2);
		System.out.println(m);
		System.out.println(m.toString());
		System.out.println(str);
		System.out.println(str.toString());
		//객체가 생성되어있다면 객체정보를 보기위해서 참조변수를 출력하는 순간 무조건 toString메서드가 호출된다.
		//참조변수에 객체의 주소가 없고 null이라면 null이 출력된다.
		//String타입을 호출하면 문자열이 출력되는 것으로 보아 String의 toString도 오버라이딩 되어있다.
	}

}
