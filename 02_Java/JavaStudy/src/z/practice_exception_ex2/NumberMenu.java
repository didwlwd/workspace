package z.practice_exception_ex2;

import java.util.Scanner;

public class NumberMenu {
	public void menu() {
		Scanner sc = new Scanner(System.in);
		NumberController nc = new NumberController();
		
		System.out.print("정수1 : ");
		int num1 = sc.nextInt();
		
		System.out.print("정수2 : ");
		int num2 = sc.nextInt();
		
		try {
			boolean qwe = nc.checkDouble(num1, num2);
			System.out.println(num1 +"은(는) "+num2 + "배수인가 ? " + qwe);
		}catch(NumRangeException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
	}
}
