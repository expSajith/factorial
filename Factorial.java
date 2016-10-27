import java.io.*;
import java.awt.*;
Public Class Factorial
{
	public static void main(String arg[])
	{
	String n;
	BufferedReader br=new BufferedReader(InputStreamReader(System.in));
n=br.readLine();
int no=Integer.parseInt(n);
int fact=1;
int i=1;
try{
for(i=1;i<=no;i++)
{
	fact=fact*i;
}
System.out.println("factorial is "+fact);
}
Catch(Exception e)
 { 
	 
 }
}
}
