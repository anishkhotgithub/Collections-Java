package Lambada_Stack_Vector;

import java.util.Scanner;

interface Math3
{
	public int operation(int a,int b);
}

public class lambda2 
{
	public static void main(String[] args)
	{
		lambda2 l2= new lambda2();
		Math3 addition=(int a ,int b)->{return a+b;};
		Math3 subtraction=(int a, int b)->{return a-b;};
		Math3 multiplication=(int a, int b)->{return a*b;};
		Math3 divide=(int a, int b)->{return a/b;};
		
		int m, n;
		Scanner sc= new Scanner(System.in);
		System.out.println("Plzz enter the value 1 ");
		m=sc.nextInt();
		System.out.println("Plzz enter the value 2 ");
		n=sc.nextInt();
		
		System.out.println(m+"+"+n+":"+l2.operate(m, n, addition));
		System.out.println(m+"-"+n+":"+l2.operate(m, n, subtraction));
		System.out.println(m+"*"+n+":"+l2.operate(m, n, multiplication));
		System.out.println(m+"/"+n+":"+l2.operate(m, n, divide));
	}
	public int operate(int a,int b, Math3 mathop)
	{
		return mathop.operation(a, b);
		
	}
}
