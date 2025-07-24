package sub1;
/*
 * 25/07/24
 * 최상규
 * 자바 Thread 실습하기
 * */
class SubThread extends Thread{
	private String name;
	
	public SubThread(String name) {
		this.name = name;
	}
	
	
	@Override
	public void run() {
		for(int i=0; i<10; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			System.out.println(name + " 작업 스레드 실행  : " + i);
		}
		System.out.println(name + " 작업 스레드 종료");
	}
}


public class ThreadTest {
	
	public static void main(String[] args) {
		
		//자식 스레드 객체 생성
		SubThread st1 = new SubThread("St1");
		SubThread st2 = new SubThread("St2");
		
		//작업 스레드 실행
		//st1.run();
		//st2.run();
		
		st1.start();
		st2.start();
		
		for(int i=0; i<10; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			System.out.println("메인 스레드 실행 : " + i);
		}
		
		System.out.println("프로그램 종료");
	}

}
