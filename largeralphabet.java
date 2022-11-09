import java.io.*;
import java.util.*;
class alphabate
{
  public static void main(String args[])
  {
    int i,j,n,c=0;
     String str;
     Scanner s =new Scanner(System.in);
     System.out.println("enter a sting:");
     str=s.next();
     n=str.length();
     int a[]=new int[20];
     char ch[]=new char[20];
     char t;
     ch=str.toCharArray();
     for (i=0;i<n;i++)
     {
       for (j=0;j<n-1;j++)
        {
            if(ch[j]>ch[j+1])
             {
               t=ch[j];
               ch[j]=ch[j+1];
               ch[j+1]=t;
              }
         }
       }
        for(i=0;i<n;i++)
        { 
          c=0;
           for(j=0;j<n;j++)
           {
                 if(ch[j]>ch[i])
   
                 {
                      c++;
                  }
                     a[i]=c;
                 }
        }
                  System.out.println("string along with no.of larger charecters:");
                 for(i=0;i<n;i++)
                  {
                       System.out.print(ch[i]);
                  }
                  System.out.println("");
                     for(i=0;i<n;i++)
                     {
                         System.out.print(a[i]);
                     }

}
}






output:
enter a sting:bala
string along with no.of larger charecters:
aabl
2210