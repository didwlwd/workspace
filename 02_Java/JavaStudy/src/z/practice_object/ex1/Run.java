package z.practice_object.ex1;

import java.util.Scanner;

public class Run {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Member mem1 = new Member("id1", "pwpw1","양");
		Member mem2 = new Member("id2", "pwpw2","동");
		Member mem3 = new Member("id3", "pwpw3","민");

		mem1.setInfo("123","ew@naver.com",14,'남');
		
		mem1.toInfo();
		
		Movie mo = new Movie();
		
		System.out.println("회원가입을 시작하겠습니다. (id, pwd, phone, name, register_num)");
		
		String id =sc.next();
		String pwd = sc.next();
		String phone = sc.next();
		String name = sc.next();
		String register_num = sc.next();
		
		mo.join_member(id, pwd, phone, name, register_num);
		
		mo.login(id,pwd);
		
		
	}

}
