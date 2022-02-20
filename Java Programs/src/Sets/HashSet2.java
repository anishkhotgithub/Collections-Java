package Sets;

import java.util.HashSet;

public class HashSet2 
{
	public static void main(String[] args)
	{
		HashSet<String> h1=new HashSet<String>();
		h1.add("Anish");
		h1.add("Puransingh");
		h1.add("Parmanand");
		h1.add("Viral");
		h1.add("Anish");
		System.out.println("Initial Elements and also we see duplicate elemnts will not added:"+h1);
		h1.remove("Anish");
		System.out.println("After Removing one elements are:"+h1);
		HashSet<String> h2=new HashSet<String>();
		h2.add("Suresh");
		h2.add("Sanket");
		h1.addAll(h2);
		System.out.println("Updated Elements are:"+h1);
		h1.removeAll(h2);
		System.out.println("Removing all new Elements"+h1);
		h1.clear();
		System.out.println("Removing all elements "+h1);
	}
}
