import java.io.*;
import java.util.*;
public class Evenno
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int a,b,i;
System.out.println("Enter the starting number");
a=sc.nextInt();
System.out.println("Enter the ending number");
b=sc.nextInt();
System.out.println("Even numbers are:");
for(i=a;i<=b;i++)
{
if(i%2==0)
{
System.out.print(i+" ");
}
}
}
}
