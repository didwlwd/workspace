package z.practice_chap1_poly_ex1;

public class CookBook extends Book{
	private boolean coupon;

	public CookBook(boolean coupon) {
		super();
		this.coupon = coupon;
	}

	public CookBook(String title, String author, String publisher, boolean coupon) {
		super(title, author, publisher);
		this.coupon = coupon;
	}

	public boolean isCoupon() {
		return coupon;
	}

	public void setCoupon(boolean coupon) {
		this.coupon = coupon;
	}

	@Override
	public String toString() {
		return "CookBook ["  + super.toString() + "coupon=" + coupon + "]";
	}
	
	
}
