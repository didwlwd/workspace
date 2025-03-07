package z.practice_object.ex3;

public class Student {
	//이름 나이 수학점수 영어점수 국어점수

		String name; //이름
		int age; //나이
		double mathScore; //수학점수
		double enScore; //영어점수
		double koScore; //국어점수
		
		//생성자
		//객체를 초기화해주기 위한 특수목적 메서드
		//개발자가 생성해주지 않으면 기능이없는 디폴트생성자가 컴파일과정에서 생성됨.
		public Student() {
			super();
		}

		//생성자도 메서드 오버로딩이 가능하다.
		//alt + shift + s -> o
		public Student(String name, int age, double mathScore, double enScore, double koScore) {
			super();
			this.name = name;
			this.age = age;
			this.mathScore = mathScore;
			this.enScore = enScore;
			this.koScore = koScore;
		}


		public void myInfo() {
			System.out.println("안녕하세요. 저는 "  + this.age + "살의 " + this.name + "입니다.");
			System.out.println("수학점수 : " + this.mathScore);
			System.out.println("영어점수 : " + this.enScore);
			System.out.println("국어점수 : " + this.koScore);
		}
		
		public void avg_info() {
			double avg = (this.mathScore + this.enScore + this.koScore) / 3.0;
			System.out.println(this.name +"의 평균 : " + avg);
		}
		
		public double getAvg() {
			return (this.mathScore + this.enScore + this.koScore) / 3.0;
		}
}




	

