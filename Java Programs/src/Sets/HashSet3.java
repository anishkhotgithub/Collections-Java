package Sets;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class HashSet3 
{
	public static void main(String[] args)
	{
		ArrayList<String> a1=new ArrayList<String>();
		a1.add("Anish");
		a1.add("Viral");
		a1.add("Mandar");
		a1.add("Aditya");
		System.out.println(a1);
		
		HashSet<String> h1=new HashSet(a1);
		h1.add("Prakash");
		Iterator<String> itr=h1.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}
}
