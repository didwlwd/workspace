package z.practice;

import java.util.Scanner;

public class Practice1 {
	/*
	 	키보드로 1개의 정수형(int) 데이터를 입력 받아, 1~100 사이의 값일 때만 2의 배수인지 아닌지
		를 출력 처리한다.
	*/
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("1~100사이 값을 입력해주세요 : ");
//		int num = sc.nextInt();
//		if(num <= 100 && num >= 1) {
//			if(num % 2 == 0) {
//				System.out.println(num + "은 2의 배수입니다.");
//			}
//			else {
//				System.out.println(num + "은 2의 배수가 아닙니다.");
//			}
//		}else {
//			System.out.println("1~100사이 값이 아닙니다.");
//		}
//			
//	}
	
	/*
	 	2단에서 5단까지의 구구단의 결과 중 홀수인 것만 출력한다. 단, for문을 이용한다. 
	*/
//	public static void main(String[] args) {
//		for(int i = 2; i <=5; i++) {
//			for(int j = 1; j<=9; j++) {
//				if((i*j) % 2 == 1) {
//					System.out.println(i + " * " + j +" = " + i*j);
//				}
//			}
//		}
//	}
	
	/*
	  1부터 100까지의 모든 정수들의 합과 평균을 구하는 프로그램을 작성한다. 
	  단, while문이나 do while문을 이용하여 작성한다.
	*/
//	public static void main(String[] args) {
//		int i = 1;
//		int sum =0;
//		while(i <= 100) {
//			sum += i;
//			i++;
//		}
//		System.out.println("모든 정수들의 합 : " + sum);
//		System.out.println("모든 정수들의 평균 : " + (float)sum/(i-1));
//	}
	
	/*
	 키보드로 2개의 정수형 데이터를 입력 받아, 두 수가 모두 1부터 9까지의 수일 때만 두 수의 곱
	 이 한자리 수인지 두자리 수인지를 출력한다.
	*/
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		
//		int num1 = sc.nextInt();
//		int num2 = sc.nextInt();
//		
//		int goum = num1 * num2;
//		
//		if(num1 >= 1 && num1 <= 9 && num2 >= 1 && num2 <= 9) {
//			if(goum >= 10) {
//				System.out.println("두자리 수 입니다.");
//			}
//			else {
//				System.out.println("한자리 수 입니다.");
//			}
//		}
//		else {
//			System.out.print("1~9사이 숫자를 입력해주세요.");
//		}
//	}
	
	
	/*
	 키보드로 1개의 정수형(int) 데이터를 입력 받아 1부터 5까지 일때만 해당 숫자에 해당하는 결과
	를 출력 한다. 단, switch문을 이용한다. 
		1 : ** 입력이 정상적으로 되었습니다! ** 
		2 : ** 조회가 시작되었습니다! ** 
		3 : ** 수정이 정상적으로 되었습니다! ** 
		4 : ** 삭제가 정상적으로 되었습니다! ** 
		5 : ** 정상적으로 종료 되었습니다! ** 
		1~5가 아닌 값이 입력 된 경우 : ** 다시 입력해 주세요! **
	*/
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("1~5 (입력, 조회, 수정, 삭제, 종료)의 번호를 입력해주세요!");
//		int num = sc.nextInt();
//		
//		switch(num) {
//		case 1:
//			System.out.println("** 입력이 정상적으로 되었습니다! **");
//			break;
//		case 2:
//			System.out.println("** 조회가 시작되었습니다! *");
//			break;
//		case 3:
//			System.out.println("** 수정이 정상적으로 되었습니다! **");
//			break;
//		case 4:
//			System.out.println("** 삭제가 정상적으로 되었습니다! ** ");
//			break;
//		case 5:
//			System.out.println("** 정상적으로 종료 되었습니다! **");
//			break;
//		default:
//			System.out.println("** 다시 입력해 주세요! **");
//		}		
//	}
	
	/*
	 	국어, 영어, 수학 세 과목의 점수를 키보드로 입력 받고 합계와 평균을 계산하고
		합계와 평균을 이용하여 합격 / 불합격 처리하는 기능을 구현하세요.
		(합격 조건 : 세 과목의 점수가 각각 40점 이상이면서 평균이 60점 이상일 경우)
		합격 했을 경우 과목 별 점수와 합계, 평균, “축하합니다, 합격입니다!”를 출력하고
		불합격인 경우에는 “불합격입니다.”를 출력하세요.
		
		ex 1.			ex 2.
		국어점수 : 88		국어점수 : 88
		수학점수 : 50		수학점수 : 50
		영어점수 : 40		영어점수 : 45
		불합격입니다.		국어 : 88
						수학 : 50
						영어 : 45
						합계 : 183
						평균 : 61.0
						축하합니다, 합격입니다!

	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어점수를 입력해주세요 : ");
		int ko_num = sc.nextInt();
		System.out.print("수학점수를 입력해주세요 : ");
		int ma_num = sc.nextInt();
		System.out.print("영어점수를 입력해주세요 : ");
		int en_num = sc.nextInt();
		
		int sum = ko_num + en_num + ma_num ;
		double avg_sum = sum/3;
		
		if(ko_num >= 40 && en_num >=40 && ma_num >= 40 && avg_sum >= 60) {
			System.out.println("국어점수 : " + ko_num);
			System.out.println("수학점수 : " + ma_num);
			System.out.println("영어점수 : " + en_num);
			System.out.println("합계 : " + sum);
			System.out.println("평균 : " + avg_sum);
			System.out.println("축하합니다, 합격입니다!");
		}else {
			System.out.println("국어점수 : " + ko_num);
			System.out.println("수학점수 : " + ma_num);
			System.out.println("영어점수 : " + en_num);
			System.out.println("합계 : " + sum);
			System.out.println("평균 : " + avg_sum);
			System.out.println("불합격입니다.");
		}
	}
}
