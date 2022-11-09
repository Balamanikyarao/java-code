import java.io.*;
import java.util.*;

class Pass_by_value
{
	public static void main (String args[])
	{
		int a,b;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a and b values :");
		a=s.nextInt();
		b=s.nextInt();
		System.out.println("Before calling a= "+a+"and b= "+b);
		Test t=new Test();
		t.swap(a,b);
		System.out.println("After calling a= "+a+"and b= "+b);
	}
}
class Test
{
	void swap(int x,int y)
	{
		System.out.println("Before Swapping a= "+x+"and b= "+y);
		int t;
		t=x;
		x=y;
		y=t;
		System.out.println("After Swapping a= "+x+"and b= "+y);
	}
}