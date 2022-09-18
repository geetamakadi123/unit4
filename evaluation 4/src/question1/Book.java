package question1;

import java.util.Objects;


public class Book {
	private int bookId ;
	private String bookName ;
	private String author ;
	
	public Book(int bookId,String bookName,String author) {
		this.bookId = bookId;
		this.bookName = bookName;
		this.author = author;
		
	}
	@Override
	public boolean equals(Object o ) {
		if(this == o) {
			return true;
		}
		if(o == null || getClass()!= o.getClass()) {
			return false;
		}
		Book book = (Book)o;
		return bookId == book.bookId;
	}
	
	@Override
	public int hashCode() {
		return Objects.hashCode(bookId);
	}
	
	 @Override
	    public String toString() {
	        return "Book{" +
	                "bookId=" + bookId +
	                ", bookName='" + bookName + '\'' +
	                ", author='" + author + '\'' +
	                '}';
	    }
	
 

}
