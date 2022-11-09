import java.io.*;
import java.lang.*;
import java.util.*;

class Decimal_Binary
{
  public static void main(string args[])
{
  scanner S = new scanner(system.in);
  System.out.println("enter any number from 1 to 255:");
  int n = s.nextInt();
  if(n<1||n>255)
  {
   System.out.println("input must be in between limits");
  }
  else
  {
   String bs = Integer.toString(n,2);
   System.out.println("bs="+bs);
   Integer bo = Integer.ValueOf(bs);
   System.out.println("bo="+bo);
   String b1=String.format("%08d",bo);
   System.out.println("b1="+b1);
   String b=String.format("%08d",Integer,valueOf(Integer.toString(n,2)));
          