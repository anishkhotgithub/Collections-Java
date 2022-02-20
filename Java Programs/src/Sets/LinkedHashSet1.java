package Sets;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSet1 
{
	public static void main(String[] args)
	{
		LinkedHashSet<String> lhs=new LinkedHashSet<String>();
		lhs.add("Anish");
		lhs.add("Mandar");
		lhs.add("Aditya");
		System.out.println(lhs);
		Iterator<String> itr=lhs.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}
}
