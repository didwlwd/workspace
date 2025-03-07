package com.kh.jdbc.menu;

import java.util.ArrayList;
import java.util.Scanner;

import com.kh.jdbc.controller.KioskController;
import com.kh.jdbc.kiosk.Kiosk;

public class KioskMenu {
	private Scanner sc = new Scanner(System.in);
	private KioskController kc = new KioskController();
	
	public void mainMenu() {
		//메인메뉴에서 주문, 상품등록관리(등록,삭제,수정)
		//1. 추천메뉴, 커피, 에스프레소,에이드, 스무디중 선택
		//2. 선택한 상품창을 들어가서 관련된 상품 DB에서 찾아오기
		//3. 관련된 상품이 나열되어있고 선택한 상품 선택
		while(true) {
			System.out.println("================ 메인 메뉴 ================");
			System.out.println("1. 주문하기");
			System.out.println("2. 상품등록관리");
			System.out.println("3. 시스템 종료");
			System.out.print("메뉴 번호 : ");
			int choice  = sc.nextInt();
			
			switch(choice) {
			case 1:
				this.orderMenu();
				break;
			case 2:
				this.management();
				break;
			case 3:
				System.out.println("종료하겠습니다.");
				return;
			default:
				System.out.println("잘못입력하셨습니다.");
			}
		
		}
	}
	
	public void orderMenu() {
		while(true) {
			System.out.println("================ 주문 메뉴 ================");
			System.out.println("1. 추천메뉴");
			System.out.println("2. 커피");
			System.out.println("3. 에이드");
			System.out.println("4. 스무디");
			System.out.println("5. 메인메뉴 돌아가기");
			System.out.print("메뉴 번호 : ");
			int choice = sc.nextInt();
			
			switch(choice) {
			case 1:
				kc.recommendMenu();
				break;
			case 2:
				kc.coffeeMenu();
				break;
			case 3:
				this.adeMenu();
				break;
			case 4:
				this.smoothieMenu();
				break;
			case 5:
				System.out.println("메인메뉴로 돌아갑니다.");
				return;
			default:
				System.out.println("잘못입력하셨습니다. 다시 입력해주세요.");
			}
		}
		
		
	}
	
	public void management() {
		while(true) {
			System.out.println("================ 상품 관리 메뉴 ================");
			System.out.println("1. 상품등록");
			System.out.println("2. 상품수정");
			System.out.println("3. 상품삭제");
			System.out.println("4. 상품검색");
			System.out.println("5. 상품전체검색");
			System.out.println("6. 추천메뉴수정");
			System.out.println("7. 메인메뉴로 돌아가기");
			System.out.print("메뉴 번호 : ");
			int choice = sc.nextInt();
			
			switch(choice) {
			case 1:
				
				break;
			case 2:
				
				break;
			case 3:
				
				break;
			case 4:
				
				break;
			case 5:
				
				break;
			case 6:
				
				break;
			case 7:
				System.out.println("메인메뉴로 돌아갑니다.");
				return;
			default:
				System.out.println("잘못입력하셨습니다.");
			}
		}
		
	}
	
	public void notfound(String message) {
		System.out.println("\n" + message);
	}
	
	
	
	public void recommendMenu(ArrayList<Kiosk> list) {
		for(Kiosk k : list) {
			System.out.println(k.toStringrecommendMenu());
		}
	}
	
	
	public void coffeeMenu() {
		System.out.println("================ 상품 관리 메뉴 ================");
		System.out.println("1. 에스프레소");
		System.out.println("2. 라떼");
		System.out.println("3. 콜드브루");
		System.out.println("4. 메인메뉴로 돌아가기");
		System.out.print("메뉴 번호 : ");
		int choice = sc.nextInt();
		
		switch(choice) {
		case 1:
			
			break;
		case 2:
			
			break;
		case 3:
			
			break;
		case 4:
			
			break;
		default:
			
		}
	}
	
	public void adeMenu() {
		
	}
	
	public void smoothieMenu() {
		
	}
}
