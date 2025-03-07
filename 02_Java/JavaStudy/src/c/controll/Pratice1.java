package c.controll;

import java.util.Scanner;

public class Pratice1 {
	/*
	 * 나이를 입력받아
	 * 13세이하면 : 어린이
	 * 13세초과 19세이하 : 청소년
	 * 19세초과 : 성인
	 * 
	 * [출력문]
	 * 나이를 입력 : xx
	 * xx세는 xxx에 속합니다.
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//		System.out.print("나이를 입력 : ");
//		int age = sc.nextInt();
//		
//		if(age <= 13) {
//			System.out.println(age + "세는 어린이에 속합니다.");
//		}
//		else if (age > 13 && age <= 19) {
//			System.out.println(age + "세는 청소년에 속합니다.");
//		}
//		else {
//			System.out.println(age + "세는 성인에 속합니다.");
//		}
		
		/*
		 * 성별을 (m/f)(대소문자 상관x)로 입력받아 남학생인 여학생인지
		 * 출력하는 프로그램을 작성하시오.
		 * 
		 * [출력문]
		 * 성별(m/f) : x
		 * 여학생입니다 / 남학생입니다. / 잘못입력하셨습니다.
		 */
		
//		System.out.print("성별 (m/f) : ");
//		char se = sc.nextLine().charAt(0);
//		
//		if(se == 'm' || se =='M') {
//			System.out.println("남학생입니다.");
//		}
//		else if(se == 'f' || se == 'F') {
//			System.out.println("여학생입니다.");
//		}
//		else {
//			System.out.println("잘못입력하셨습니다.");
//		}
		
		/*
		 * 정수(양수)를 입력받아
		 * 짝수인지 홀수인지 출력하는 프로그램을 작성하라
		 * 
		 * [출력문]
		 * 정수 입력 : xx
		 * 짝수다 / 홀수다 / 양수가 아니다.
		 */
		
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		
		if(num > 0) {
			if(num % 2 ==0) {
				System.out.println("짝수다.");
			}
			else {
				System.out.println("홀수다.");
			}
		}
		else {
			System.out.println("양수가 아니다.");
		}
		
	}

}
