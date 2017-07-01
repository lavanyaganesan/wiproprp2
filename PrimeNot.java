import java.io.*;
import java.util.*;
public class PrimeNot
{
public static void main(String args[])
{
Scanner sc=new Scanner(system.in);
int a,i,flag=1;
System.out.println("Enter the number");
a=sc.nextInt();
for(i=2;i<=a/2;i++)
{
if(a%2!=0)
{
System.out.println("It is not a prime number");
break;
}
}
if(flag==0)
{
System.out.println("It is a prime number");
}
}
}
