package z.practice_interface.ex1;

public class Run {

	public static void main(String[] args) {
		PhoneController pc = new PhoneController();
		String[] results = pc.method();
		
		for(String res : results) {
			System.out.println(res);
			System.out.println();
		}
		
	}

}
