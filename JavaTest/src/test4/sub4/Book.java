package test4.sub4;

public class Book {
	private String title;
	private String author;
	private String isbn;
	private boolean isBorrowd;
	
	public Book(String title, String author, String isbn) {
		this.title = title;     
		this.author = author;    
		this.isbn = isbn;      
		this.isBorrowd = false; 
	}
	
	public void borrowBook() {
		if(isBorrowd == false) {
			System.out.println("도서대출 : " + title);
			isBorrowd = true;
		}else {
			System.out.println(title + " 이미 대출 됨");
		}
	}
	
	public void returnBook() {
		if(isBorrowd) {
			System.out.println("도서반납 : " + title);
			isBorrowd = false;
			title = "없음";
		}else {
			System.out.println("대출한 도서 없음.");
		}
	}
	
	public void getBookInfo() {
		System.out.println("도서명 : " + title);
		System.out.println("저자 : " + author);
		System.out.println("ISBN : " + isbn);
		if(isBorrowd == false) {
			System.out.println("대출여부 : 가능");
		}else {
			System.out.println("대출여부 : 불가능");
		}
		
	}
	
	public String getTitle() {
		return title;
	}
}
