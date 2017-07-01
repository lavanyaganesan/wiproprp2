import java.io.*;
import java.util.*;
public class Tables
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int a=1,b=1,x,y,s;
System.out.println("Enter table no:");
x=sc.nextInt();
System.out.println("Table upto");
y=sc.nextInt();
while(a<=y)
{
s=x*b;
System.out.println(b+" * "+x+" = "+s);
b++;
a++;
}
}
}
