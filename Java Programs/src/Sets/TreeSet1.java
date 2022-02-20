package Sets;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSet1<E> 
{
	//WildcardUpperBound has been used
	private static Integer TreeSet1(TreeSet<? extends Number> t)
	{
		int sum=0;
		for(Number e:t)
		{
			sum+= e.intValue();
		}
		return sum;
	}
	public static void main(String[] args)
	{
		TreeSet<Integer> ts=new TreeSet<Integer>();
		ts.add(4);
		ts.add(5);
		ts.add(6);
		ts.add(7);
		ts.add(9);
		System.out.println("TreeSet elements are"+ts);
		System.out.println("Descending order:"+ts.descendingSet());
		System.out.println("HeadSet"+ts.headSet(9,true));
		System.out.println("SubSet"+ts.subSet(4, false,7,true));
		System.out.println("TailSet"+ts.tailSet(6,true));
		Iterator itr=ts.descendingIterator();
		System.out.println("Through descending Iterator order");
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		ts.removeIf(str->str.equals(9));
		System.out.println("Highest value "+ts.pollFirst()+"\nLowest value "+ts.pollLast());
		Iterator<Integer> i=ts.iterator();
		System.out.println("TreeSet elements in forward directions");
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		System.out.println("Total sum is "+TreeSet1(ts));
	}
}
