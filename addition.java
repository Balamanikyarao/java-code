/*addition of two numbers by user input*/
import java.io.*;
import java.util.*;

class addition
{
	public static void main(String args[])
	{
	int a,b,c;
	Scanner s=new Scanner(System.in);
	System.out.println("enter the values");
	a=s.nextInt();
	b=s.nextInt();
	c=a+b;
	System.out.println(c);
	}
}

