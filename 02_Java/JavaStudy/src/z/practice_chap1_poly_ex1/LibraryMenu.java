package z.practice_chap1_poly_ex1;

import java.util.Scanner;

public class LibraryMenu {
	private LibraryController lc = new LibraryController();
	private Scanner sc = new Scanner(System.in);
	
	public void mainMenu() {
		String name;
		int age;
		char gender;
		
		System.out.print("이름 : ");
		name = sc.next();
		
		System.out.print("나이 : ");
		age = sc.nextInt();
		
		System.out.print("성별 : ");
		gender = sc.next().charAt(0);
		
		lc.insertMember(new Member(name,age,gender));
		
		while(true) {
			System.out.println("==== 메뉴 ====");
			System.out.println("1. 마이페이지");
			System.out.println("2. 도서 전체 조회");
			System.out.println("3. 도서 검색");
			System.out.println("4. 도서 대여하기");
			System.out.println("5. 도서 추가하기");//추가가능한지? 맨뒤에 추가
			System.out.println("6. 도서 삭제하기");//어떤도서를 삭제할지?
			System.out.println("9. 프로그램 종료하기");
			System.out.print("메뉴 번호 : ");
			int choice = sc.nextInt();
			
			switch(choice) {
			case 1:
				System.out.println(lc.myInfo());
				break;
			case 2:
				this.selectAll();
				break;
			case 3:
				this.searchBook();
				break;
			case 4:
				this.rentBook();
				break;
			case 5:
				if(lc.isInsertBook()) {
					this.insertBook();
				}else {
					System.out.println("추가가능한 ");
				}
				
				break;
			case 6:
				this.deleteBook();
				break;
			case 9:
				System.out.println("프로그램을 종료합니다.");
				return;
			default:
				System.out.println("잘못입력하셧습니다. 다시 입력해주세요.");
			}
		}
	}
	
	public void selectAll() {
		Book[] bList = lc.selectAll();
		
		for(int i=0; i < bList.length && bList[i] != null; i++) {
			System.out.println(i +"번 도서 : " + bList[i]);
		}
		
	}
	
	public void searchBook() {
		String keyword;
		System.out.print("검색할 제목 키워드 : ");
		keyword = sc.next();
		
		Book[] searchList = lc.searchBook(keyword);
		for(int i=0; i<searchList.length && searchList[i] != null; i++) {
			System.out.println(searchList[i]);
		}
			
	}
	
	public void rentBook() {
		selectAll();
		
		System.out.print("대여할 도서 번호 선택 : ");
		int index = sc.nextInt();
		int result = lc.rentBook(index);
		
		switch(result) {
		case 0:
			System.out.println("성공적으로 대여되었습니다.");
			break;
		case 1:
			System.out.println("나이 제한으로 대여 불가능입니다.");
			break;
		case 2:
			System.out.println("성공적으로 대여되었습니다. 요리학원 쿠폰이 발급되었으니 마이페이지에서 확인하세요");
			break;
		}
	}
	
	public void insertBook() {
		while(true) {
			String book, title, author, publisher;
			boolean isCoupon;
			int accessAge = 0;
			int index = 0; 
			
			if(lc.selectAll() == null) {
				return;
			}
			
			System.out.print("추가할 도서 종류 (Cook / Ani) : ");
			book = sc.next();
			sc.nextLine();
			
			if(!(book != "Cook" || book != "Ani")) {
				continue;
			}
			
			switch(book) {
			case "Cook":
				System.out.print("도서 이름 : ");
				title = sc.next();
				System.out.print("작가 이름 : ");
				author = sc.next();
				System.out.print("출판사 이름 : ");
				publisher = sc.next();
				System.out.print("요리학원쿠폰유무 : ");
				isCoupon = (sc.next() == "Cook");
				
				index = lc.insertBook(new CookBook(title,author,publisher, isCoupon)); 
				
				break;
			case "Ani":
				System.out.print("도서 이름 : ");
				title = sc.next();
				System.out.print("작가 이름 : ");
				author = sc.next();
				System.out.print("출판사 이름 : ");
				publisher = sc.next();
				System.out.print("제한 나이 : ");
				accessAge = sc.nextInt();
				
				index = lc.insertBook(new AniBook(title,author,publisher, accessAge));
				break;
			default:
				System.out.println("잘못입력하셨습니다.");
			}
			
			System.out.println(index + "번째만에 성공했습니다.");
			break;
		}
	}
	
	public void deleteBook() {
		selectAll();
		
		System.out.print("삭제할 도서 번호 선택 : ");
		int index = sc.nextInt();
		lc.deleteBook(index);
	}
}
