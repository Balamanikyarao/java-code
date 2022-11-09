import java.io.*;
import java.util.*;
class Test
{
	int a,b,t;
	void swap(Test te)
	{
		System.out.println("Before Swapping a= "+a+"and b= "+b);
		t=te.a;
		te.a=te.b;
		te.b=t;
		System.out.println("After Swapping a= "+a+"and b= "+b);
	}
}
class Pass_by_obj
{
	public static void main (String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a and b values :");
		Test te = new Test();
		te.a=s.nextInt();
		te.b=s.nextInt();
		System.out.println("Before calling a= "+te.a+"and b= "+te.b);
		te.swap(te);
		System.out.println("After calling a= "+te.a+"and b= "+te.b);
	}
}