package Generics;

import java.util.Arrays;
import java.util.List;

public class WildCardsLowerBound
{
	public static void printOnlyIntegerClassorSuperClass (List<? super Integer>list)
	{
		System.out.println(list);
	}
	public static void main(String[] args)
	{
		// Lower Bounded Integer List
		List<Integer> li=Arrays.asList(1,2,3,4);
		// Integer list object is being passed
		printOnlyIntegerClassorSuperClass(li);
		// Number list
		List<Number> li2=Arrays.asList(1,2,3,4);
		// Integer list object is being passed
		printOnlyIntegerClassorSuperClass(li2);
	}
}