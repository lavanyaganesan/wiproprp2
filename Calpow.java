import java.io.*;
import java.util.*;
public class Calpow
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int a,b;
System.out.println("Enter the base number");
a=sc.nextInt();
System.out.println("Enter the power number");
b=sc.nextInt();
x=(int) Math.pow(a,b);
System.out.println(a+"^"+b+"="+x);
}
}
