package Generics;

public class GenericsMethod
{
	public static <T>void GenericsMethod(T t)
	{
		System.out.println(t.getClass().getName()+ "=" +t);
	}
	public static void main(String[] args)
	{
		GenericsMethod(11);
		GenericsMethod("Anish");
		GenericsMethod(10.5);
	}
}
