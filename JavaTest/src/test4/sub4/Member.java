package test4.sub4;

public class Member {
	private String name;
	private String memberId;
	private Book borrowedBook;
	
	public Member(String name, String memberId) {
		this.name = name;
		this.memberId = memberId;
		this.borrowedBook = null;
	}
	
	public void borrowBook(Book borrowedBook) {
		borrowedBook.borrowBook();
		this.borrowedBook = borrowedBook;
	}
	
	public void returnBook(Book borrowedBook) {
		borrowedBook.returnBook();
		this.borrowedBook = borrowedBook;
	}
	
	public void getMemberInfo() {
		System.out.println("회원명 : " + name);
		System.out.println("아이디 : " + memberId);
		System.out.println("대출한 도서 : " + borrowedBook.getTitle());
	}
}
