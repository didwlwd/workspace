package z.practice_exception_ex2;

public class NumberController {

	public NumberController() {
		super();
	}
	
	public boolean checkDouble(int num1, int num2) throws NumRangeException{
		boolean check;
		if((num1 >= 1 && num1 <= 100) && (num2 >=1 && num2 <= 100)) {
			if(num1 % num2 ==0) {
				check = true;
			}
			else {
				check = false;
			}
		}else {
			throw new NumRangeException("1부터 100 사이의 값이 아닙니다.");
		}
		return check;
	}
}
