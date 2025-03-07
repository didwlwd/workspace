package b.operator;

import java.util.Scanner;

public class Practice1 {
	/*
	 * 키보드로 가로, 세로값을 실수형으로 입력받아 사각형의 면적과 둘레를 계산하여 출력
	 * 면적 : 가로 * 세로
	 * 둘레 : (가로 + 세로) * 2
	 * 
	 * [출력창]
	 * 가로 : (키보드로입력)
	 * 세로 : (키보드로입력)
	 * 
	 * 면적 : ~
	 * 둘레 : ~
	 * + 소수점 2번째자리까지만 출력
	 */
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("가로 : ");
		float co = sc.nextFloat();
		
		System.out.print("세로 : ");
		float so = sc.nextFloat();
		
		float qw = co * so;
		System.out.printf("면적 : %.2f \n" , qw);
		
		float as = (co + so) *2;
		System.out.printf("둘레 : %.2f", as);
		

	}

}
