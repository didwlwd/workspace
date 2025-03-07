package z.practice_oop.ex3;

public class Human {
	private String name;
	private int price;
	private TV tv = new TV();
	
	public Human() {
		super();
	}

	public Human(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}
	
	public void buy(TV tv) {
		if(this.price < tv.getPrice()) {
			System.out.println(this.name + "님 잔액이 부족하여 구매하실 수 없습니다.");
		}else {
			System.out.println(this.name + "님 구매내역");
			tv.show();
			System.out.println("남은잔액 : " + (this.price - tv.getPrice()));
		}
	}
	
}
