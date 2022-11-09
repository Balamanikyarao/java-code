import java.io.*;
import java.util.*;
class SGPA
{
public static void main(String args[])
{
String Subjects[]={"Graphics","pps","Java","Chemistry","english","technicalskills","Datastructures"};
double cr[]={2,4,3,3,2,1.5,4};
int i,n;
n=Subjects.length;
char Grade[]=new char[20];
Scanner s=new Scanner(System.in);
for(i=0;i<n;i++)
{
System.out.print("Enter grade of "+Subjects[0]+"");
Grade[i]=s.next().charAt(0);
}
int GP[]=new int[20];
for(i=0;i<n;i++)
{
switch(Grade[i])
{
case 'O':GP[i]=10;
	 break;
case 'A':GP[i]=9;
	 break;
case 'B':GP[i]=8;
	 break;
case 'C':GP[i]=7;
	 break;
case 'D':GP[i]=6;
	 break;
case 'E':GP[i]=5;
	 break;
case 'F':GP[i]=0;
	 System.out.println("You are failed");
	 System.exit(0);
default:System.out.println("Enter correct Grade:");
	i--;
}//switch
}//for
double tc=0,sum=0,SGPA;
for(i=0;i<n;i++)
{
sum=sum+GP[i]*cr[i];
tc=tc+cr[i];
}
SGPA=sum/tc;
System.out.println("SGPA of a student:"+SGPA);
}
}