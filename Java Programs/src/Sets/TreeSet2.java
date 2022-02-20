package Sets;

import java.util.Set;
import java.util.TreeSet;

class Book implements Comparable<Book>
{
	int id;
	String name,author,publisher;
	public Book(int id, String name, String author, String publisher) {
		super();
		this.id = id;
		this.name = name;
		this.author = author;
		this.publisher = publisher;
	}
	public int compareTo(Book b)
	{
		if(id>b.id){  
	        return 1;  
	    }else if(id<b.id){  
	        return -1;  
	    }else{  
	    return 0;  
	    }  
	}
}
public class TreeSet2 
{
	
	public static void main(String[] args)
	{
		Set<Book> set=new TreeSet<Book>();  
	    //Creating Books  
	    Book b1=new Book(121,"Let us C","Yashwant Kanetkar","BPB");  
	    Book b2=new Book(233,"Operating System","Galvin","Wiley");  
	    Book b3=new Book(101,"Data Communications & Networking","Forouzan","Mc Graw Hill"); 
	    Book b4=new Book(101,"Data Communications & Networking","Forouzan","Mc Graw Hill"); 
	    //Adding Books to TreeSet  
	    set.add(b1);  
	    set.add(b2);  
	    set.add(b3);
	    set.add(b4);
	    //Traversing TreeSet  
	    for(Book b:set){  
	    System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher);  
	    }  
	}
}
