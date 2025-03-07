package z.practice_interface.ex1;

public abstract class SmartPhone implements TouchDisplay, CellPhone{
	private String maker;

	public SmartPhone() {
		super();
	}
	
	public String printInformation() {
		return null;
	}

	public String getMaker() {
		return maker;
	}

	public void setMaker(String maker) {
		this.maker = maker;
	}
	
	
}
