package sub5;

public class Sedan extends Car {
	private int cc;
	private final int MAX_SPEED = 180;
	
	public Sedan(String name, String color, int speed,int cc) {
		
		//부모클래스 생성자 호출, 자식클래스는 부모클래스 속성을 초기화 해줘야 한다.
		super(name, color, speed);
		this.cc = cc;
	}
	
	@Override
	public void speedUp(int speed) {
		//부모클래스 speedUp을 자식클래스에 맞게 재정의
		this.speed += speed;
		
		if(this.speed > MAX_SPEED) {
			this.speed = MAX_SPEED;
		}
	}
	
	public void turbo() {
		//부모 클래스 speed 참조를 위해 접근저에를 private에서 protected로 변경
		this.speed += 10;
	}
	
	public void show() {
		super.show();
		System.out.println("배기량 : " + this.cc);
	}

}
