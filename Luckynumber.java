/*print lucky number*/
import java.io.*;
import java.util.*;
import java.lang.*;
class luckynumber
{
  public static void main(String args[])
  {
    int n,i,j,c=0,sum;
    Scanner s=new Scanner(System.in);
    System.out.println("enter no of elements in array");
    n=s.nextInt();
    int a[]=new int[20];
    int b[]=new int[20];
    System.out.println("enter elements to an array");
    for(i=0;i<n;i++)
    {
     a[i]=s.nextInt();
     }
     for(i=0;i<n;i++)
     { 
        sum=0;
        for(j=1;j<10;j++)
       {
         sum=sum+(int)Math.pow(7,j);

            if(a[i]==sum)
	    {
		b[c]=a[i];
		c++;
		break;
	     }
         }
       }
   System.out.println("lucky number in the array:"+c);
   System.out.println("the lucky numbers are:");
	for(i=0;i<c;i++)
        {
	  System.out.print(b[i]+" ");
	}
  }
}




output:


enter no of elements in array
3
enter elements to an array
7
55
77
lucky number in the array:1
the lucky numbers are:
7 		