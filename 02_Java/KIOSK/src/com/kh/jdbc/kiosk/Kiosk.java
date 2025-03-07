package com.kh.jdbc.kiosk;

public class Kiosk {
	private int itemNo;
	private String name;
	private int price;
	private String soldoutcheck;
	private String ItemInfo;
	
	public Kiosk() {
		super();
	}

	public Kiosk(int itemNo, String name, int price, String soldoutcheck,String ItemInfo) {
		super();
		this.itemNo = itemNo;
		this.name = name;
		this.price = price;
		this.soldoutcheck = soldoutcheck;
		this.ItemInfo = ItemInfo;
	}

	public String getItemInfo() {
		return ItemInfo;
	}

	public void setItemInfo(String itemInfo) {
		ItemInfo = itemInfo;
	}

	public String getSoldoutcheck() {
		return soldoutcheck;
	}

	public int getItemNo() {
		return itemNo;
	}

	public void setItemNo(int itemNo) {
		this.itemNo = itemNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String isSoldoutcheck() {
		return soldoutcheck;
	}

	public void setSoldoutcheck(String soldoutcheck) {
		this.soldoutcheck = soldoutcheck;
	}

	@Override
	public String toString() {
		return "Kiosk [itemNo=" + itemNo + ", name=" + name + ", price=" + price + ", soldoutcheck=" + soldoutcheck
				+ ", ItemInfo=" + ItemInfo + "]";
	}

	public String toStringrecommendMenu() {
		return "추천 메뉴 : " + name + " 가격 : " + price + "원 " + "제고확인 : " + soldoutcheck;
	}
	
	
}
