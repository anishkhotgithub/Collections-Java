package Sets;

import java.util.HashSet;
import java.util.Iterator;

public class HashSet1 
{
	public static void main(String[] args)
	{
		HashSet<String> h1=new HashSet();
		h1.add("Anish");
		h1.add("Puransingh");
		h1.add("Parmanand");
		h1.add("Viral");
		h1.add("Anish");
		Iterator<String> ltr=h1.iterator();
		while(ltr.hasNext())
		{
			System.out.println(ltr.next());
		}
//		for(String s1:h1)
//		{
//			System.out.println(s1);
//		}
		
	}
}
