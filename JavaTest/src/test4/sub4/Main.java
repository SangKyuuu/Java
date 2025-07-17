package test4.sub4;

public class Main {

	public static void main(String[] args) {
		Book b = new Book("자바 프로그래밍", "제임스 고슬링","101-1234-1001");
		
		Member m = new Member("홍길동", "A001");
		
		b.getBookInfo();
		System.out.println("------------------");
		
		m.borrowBook(b);
		System.out.println("------------------");
		
		b.getBookInfo();
		System.out.println("------------------");
		
		m.getMemberInfo();
		System.out.println("------------------");
		
		m.borrowBook(b);
		System.out.println("------------------");
		
		m.returnBook(b);
		System.out.println("------------------");
		
		m.getMemberInfo();
		System.out.println("------------------");
	}

}
