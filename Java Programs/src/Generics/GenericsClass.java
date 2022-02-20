package Generics;

public class GenericsClass<T>
{
	private T t;
	public void setValue(T t)
	{
		this.t=t;
	}
	public T getValue()
	{
		return t;
	}
	public static void main(String args[])
	{
		GenericsClass<Integer> igc=new GenericsClass<Integer>();
		igc.setValue(10);
		System.out.println(igc.getValue());
		
		GenericsClass<String> sgc =new GenericsClass<String>();
		sgc.setValue("Anish");
		System.out.println(sgc.getValue());
	}
}
