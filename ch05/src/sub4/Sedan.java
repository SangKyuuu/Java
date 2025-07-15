package sub4;

public class Sedan extends Car {
	private int cc;
	
	public Sedan(String name, String color, int speed,int cc) {
		
		//부모클래스 생성자 호출, 자식클래스는 부모클래스 속성을 초기화 해줘야 한다.
		super(name, color, speed);
		this.cc = cc;
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
