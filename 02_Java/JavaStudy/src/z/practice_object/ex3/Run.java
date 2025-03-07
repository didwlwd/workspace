package z.practice_object.ex3;

import java.util.Scanner;

public class Run {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//choi객체 생성 최지원, 15살, 수학 : 80, 영어 : 60,  국어 : 90
		//kim객체 생성 김민수, 17살, 수학 : 60, 영어 : 75,  국어 : 70
		//park객체 생성 박지민, 19살, 수학 : 90, 영어 : 45,  국어 : 85
		Student choi = new Student("최지원", 15, 80, 60, 90);
		Student kim = new Student("김민수", 17, 60, 75, 70);
		Student park = new Student("박지민", 19, 90, 45, 85);
		
//		choi.myInfo();
//		kim.myInfo();
//		park.myInfo();
//		
//		//각 학생의 평균을 구하세요.
//		choi.avg_info();
//		kim.avg_info();
//		park.avg_info();
		
		//lee라는 객체를 만들 것이다.
		//사용자로부터 이름, 나이, 영어점수, 수학점수, 국어점수를 입력받아
		//평균을 구해서 출력하는 프로그램 작성
		System.out.print("이름, 나이, 영어점수, 수학점수, 국어점수 순으로 입력해주세요.");
		String name = sc.next();
		int age = sc.nextInt();
		double enscore = sc.nextDouble();
		double mathscore = sc.nextDouble();
		double koscore = sc.nextDouble();
		
		Student lee = new Student(name, age, enscore, mathscore, koscore);
		
		lee.myInfo();
		lee.avg_info();
		
		//kh대학교 evgcut : 75, encut : 60, kocut : 60
		University kh = new University("kh대학교", 75, 60, 60);
		
//		kh.apply(lee);
//		kh.apply(choi);
//		kh.apply(kim);
//		kh.apply(park);
		
		kh.apply(lee.name, lee.getAvg(), lee.enScore,lee.koScore);
		
		
		
	}

}
