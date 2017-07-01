import java.io.*;
import java.util.*;
public class Oddno
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int a,b,i;
System.out.println("Enter the starting number");
a=sc.sc.nextInt();
System.out.println("Enter the ending number");
b=sc.nextInt();
System.out.println("Odd numbers are:");
for(i=a;i<=b;i++)
{
if(i%2==1)
{
System.out.print(i+" ");
}
}
}
}
