package Generics;

public class GenericsClass2<T,U> 
{
	private T t;
	private U u;
	
	public GenericsClass2(T t,U u) 
	{
		this.t=t;
		this.u=u;
	}
	public void print()
	{
		System.out.println(t);
		System.out.println(u);
	}
	public static void main(String[] args)
	{
		GenericsClass2<Integer, String> gc=new GenericsClass2<Integer, String>(1, "Anish");
		gc.print();
	}
}
