package sub2;

/*	날짜: 2025/07/14
	이름: 최상규
	내용: 캡슐화 실습하기
	
	
	캡슐화(정보은닉, Encapsulation)
	- 캡슐화는 객체의 속성을 외부에서 참조하지 못하게 객체의 속성을 은닉하는 특성
	- 클래스의 속성을 반드시 private로 선언
	- private 선언을 하면 생성자(Constructor)로 속성을 초기화
	- 은닉된 정보(속성)을 안전하게 사용하기 위해 Getter, Setter 사용
	
*/
public class EncapsuleTest {
	public static void main(String[] args) {
		//객체생성
		Car sonata = new Car("소나타", "흰색", 0);
		
		//은닉된 멤버변수는 생성자로 초기화
		
		sonata.speedUp(80);
		sonata.speedDown(20);
		sonata.show();
		
		Car avante = new Car("아반떼", "검은색", 0);
		
		avante.speedUp(60);
		avante.speedDown(20);
		avante.show();
		
		//개별속성이 은닉되어 있기 때문에 수정 불가, setter 사용 하여 수정
		avante.setColor("남색");
		avante.show();
		
		//Account 객체생성, 초기화
		
		Account kb = new Account("국민은행", "101-11-1001", "김유신", 10000);
		
		
		/*kb.bank = "국민은행";
		kb.id = "101-11-1001";
		kb.name = "김유신";
		kb.balance = 10000;*/
		
		kb.deposit(50000);
		kb.withdraw(30000);
		kb.show();
		
		kb.setName("김유진");
		kb.show();
		
		Account wr = new Account("우리은행", "101-21-2001", "김춘추", 30000);
		
		/*wr.bank = "우리은행";
		wr.id = "101-21-2001";
		wr.name = "김춘추";
		wr.balance = 30000;*/
		
		wr.deposit(30000);
		wr.withdraw(10000);
		wr.show();
		
		//wr.bank = "너희은행";
		wr.setBank("너희은행");
		wr.show();
		
		
		Book b1 = new Book("삼국지","나관중","10001",10);
		b1.show();
		
		boolean isOk = b1.borrowBook();
		
		if(isOk) {
			System.out.println("도서대출성공");
		}else {
			System.out.println("도서대출실패");
		}
		
		b1.show();
		
		Book b2 = new Book("명품 Java","황기태","10002",1);
		
		isOk = b2.borrowBook();
		isOk = b2.borrowBook();
		
		if(isOk) {
			System.out.println("도서대출성공");
		}else {
			System.out.println("도서대출실패");
		}
		
		b2.show();
	}
}
