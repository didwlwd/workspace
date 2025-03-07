package z.practice_exception_ex1;


import java.util.Scanner;

public class CharacterMenu {
	public void menu() {
		
		CharacterController cc = new CharacterController();
		System.out.print("문자열 : ");
		try (Scanner sc = new Scanner(System.in);){
			String str = sc.nextLine();
			
			int en = cc.countAlpha(str);
			System.out.println("'"+ str + "'에 포함된 영문자 개수 :" + en);
			
		}catch(CharCheckException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		System.out.println("종료됩니다.");
		
	}
}
