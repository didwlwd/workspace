package q.thread.ex1;

//쓰레드를 만드는 방법 2
//Runnable 클래스를 구현
public class MyRunnable implements Runnable{

	@Override
	public void run() {
		int n1 = 20;
		int n2 = 30;
		
		//Thread.currentThread() 지금 실행하고 있는 쓰레드의 정보객체를 반환
		String name = Thread.currentThread().getName();
		System.out.println(name + " : " + (n1 + n2));
	}
	
}
