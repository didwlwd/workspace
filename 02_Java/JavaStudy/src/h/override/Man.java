package h.override;

public class Man {
	private String man;

	public String getMan() {
		return man;
	}
	
	public Man(String man) {
		super();
		this.man = man;
	}


	public void setMan(String man) {
		this.man = man;
	}

	@Override
	public String toString() {
		return "Man [man=" + man + "]";
	}
	

}
