package h.inherit2;

public class Product {
	private String brand;
	private String pCode;
	private String pName;
	private int price;
	
	public Product() {
		//상속관계에서 부모생성자를 명시하지 않으면
		//부모의 기본생성자 호출
		System.out.println("product()");
	}

	public Product(String brand, String pCode, String pName, int price) {
		super();
		this.brand = brand;
		this.pCode = pCode;
		this.pName = pName;
		this.price = price;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getpCode() {
		return pCode;
	}

	public void setpCode(String pCode) {
		this.pCode = pCode;
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	public String information() {
		return "브랜드 : "  + brand + "제품번호 : " + pCode + " 제품명 : " + pName + 
				" 가격 : " + price + "원";
	}
	
	
}
