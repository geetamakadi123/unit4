package question4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Libary {
	
	private List<Book> bookList=new ArrayList<Book>();

    public void setBookList(ArrayList<Book> bookList){
        this.bookList=bookList;
    }
    public ArrayList<Book> getBookList(){
        return (ArrayList<Book>) bookList;
    }
    public void addBook(Book bobj){
        bookList.add(bobj);
    }
    public boolean isEmpty(){
        return bookList.isEmpty();
    }
    public ArrayList<Book> viewAllBooks(){
        return (ArrayList<Book>) bookList;
    }
    public ArrayList<Book> viewBooksByAuthor(String author){
        ArrayList<Book> result=new ArrayList<Book>();
        Iterator iter=bookList.iterator();
        while(iter.hasNext())
        {
            Book b=(Book)iter.next();
            if(b.getAuthor().equalsIgnoreCase(author))
                result.add(b);
        }
        return result;
    }
    public int countnoofbook(String bname){
        int count=0;
        Iterator iter=bookList.iterator();
        while(iter.hasNext())
        {
            Book b=(Book)iter.next();
            if(b.getBookName().equalsIgnoreCase(bname))
                count++;
        }
        return count;
    }

}
