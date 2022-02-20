package List;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class List1 
{
	public static void main(String[] args)
	{
		List<String> l1=new ArrayList<String>();
		l1.add("Anish");
		l1.add("Mandar");
		l1.add("Lavanya");
		l1.add("Prakash");
		
		Collections.sort(l1);
		for(String names:l1)
		{
			System.out.println(names);
		}
		
		List<String> l2=new ArrayList<String>();
		l2.add("Parmand");
		l2.add("SuryaPrakash");
		l2.add("Purva");
		l2.add("Viral");
		ListIterator<String> ltr=l2.listIterator();
		System.out.println("Traversing in forward directions");
		while(ltr.hasNext())
		{
			System.out.println("index "+ltr.nextIndex()+" "+ltr.next());
		}
		System.out.println("Traversing in backwards directions");
		while(ltr.hasPrevious())
		{
			System.out.println("index "+ltr.previousIndex()+" "+ltr.previous());
		}
	}
}
