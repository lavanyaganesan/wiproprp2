import java.io.*;
import java.util.*;
public class Factno
{
public static void main(String args[])
{
Scanner sc=nnew Scanner(System.in);
int a,i,fact=1;
System.out.println("Enter the number");
a=sc.nextInt();
for(i=1;i<=a;i++)
{
fact=fact*i;
}
System.out.println("Factorial number is: "+fact);
}
}
