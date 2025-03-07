package z.practice_point_ex1;

import java.util.Scanner;

/*
 * Menu클래스의 역할
 * 프리젠테이션 뷰의 역할
 * : 사용자와의 소통을 위한 클래스(입출력)
 */
public class PointMenu {
	private Scanner sc = new Scanner(System.in);
	private CircleController cc= new CircleController();
	private RectangleController rc = new RectangleController();
	
	public void mainMenu() {
		while(true) {
			System.out.println("===== 메뉴 =====");
			System.out.println("1.원");
			System.out.println("2.사각형");
			System.out.println("9.끝내기");
			System.out.print("메뉴 번호 : ");
			int choice = sc.nextInt();
			
			switch(choice) {
			case 1:
				circleMenu();
				break;
			case 2:
				rectangleMenu();
				break;
			case 9:
				System.out.println("종료합니다.");
				return;
			default:
				System.out.println("종료합니다.");
				return;
			}
		}
		
		
	}
	
	public void circleMenu() {
		System.out.println("===== 원 메뉴 =====");
		System.out.println("1.원 둘레");
		System.out.println("2.원 넒이");
		System.out.println("9.메인으로");
		System.out.print("메뉴 번호 : ");
		int choice = sc.nextInt();
		
		switch(choice) {
		case 1:
			calcCircum();
			break;
		case 2:
			calcCircleArea();
			break;
		case 9:
			return;
		default:
			return;
		}
	}
	
	public void rectangleMenu() {
		System.out.println("===== 사각형 메뉴 =====");
		System.out.println("1.사각형 둘레");
		System.out.println("2.사각형 넒이");
		System.out.println("3.메인으로");
		System.out.print("메뉴 번호 : ");
		int choice = sc.nextInt();
		
		switch(choice) {
		case 1:
			calcPerimeter();
			break;
		case 2:
			calcRectArea();
			break;
		case 3:
			return;
		default:
			return;
		}
	}
	
	public void calcCircum() {
		int x,y,r;
		String s;
		System.out.print("x 좌표 : ");
		x = sc.nextInt();
		
		System.out.print("y 좌표 : ");
		y = sc.nextInt();
		
		System.out.print("반지름 : ");
		r = sc.nextInt();
		
		s = cc.calcCricum(x, y, r);
		System.out.println(s);
	}
	
	public void calcCircleArea() {
		int x,y,r;
		String s;
		System.out.print("x 좌표 : ");
		x = sc.nextInt();
		
		System.out.print("y 좌표 : ");
		y = sc.nextInt();
		
		System.out.print("반지름 : ");
		r = sc.nextInt();
		
		s = cc.calcArea(x, y, r);
		System.out.println(s);
	}
	
	public void calcPerimeter() {
		int x,y,h,w;
		String s;
		System.out.print("x 좌표 : ");
		x = sc.nextInt();
		
		System.out.print("y 좌표 : ");
		y = sc.nextInt();
		
		System.out.print("높이 : ");
		h = sc.nextInt();
		
		System.out.print("너비 : ");
		w = sc.nextInt();
		
		s = rc.calcPerimeter(x, y, h, w);
		System.out.println(s);
	}
	
	public void calcRectArea() {
		int x,y,h,w;
		String s;
		System.out.print("x 좌표 : ");
		x = sc.nextInt();
		
		System.out.print("y 좌표 : ");
		y = sc.nextInt();
		
		System.out.print("높이 : ");
		h = sc.nextInt();
		
		System.out.print("너비 : ");
		w = sc.nextInt();
		
		s = rc.calcArea(x, y, h, w);
		System.out.println(s);
	}
}
