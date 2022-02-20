package Generics;

import java.util.Arrays;
import java.util.List;

public class WildCardUnbounded 
{
	public static void printArrayList(List<?>list)
	{
		System.out.println(list);
	}
	public static void main(String[] args)
	{
		List<Integer> l1=Arrays.asList(1,2,3,4,5);
		printArrayList(l1);
		List<Double> l2=Arrays.asList(1.1,1.2,1.3,1.4);
		printArrayList(l2);
	}
}
