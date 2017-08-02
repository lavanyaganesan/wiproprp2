import java.util.*;
import java.io.*;
import java.lang.*;
public class as
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
ArrayList<Integer> al=new ArrayList<Integer>();
int n,i;
System.out.println("ENter the number of elements in the array");
n=sc.nextInt();
System.out.println("Enter the elements");
int a[]=new int[n];
for(i=0;i<n;i++)
{
a[i]=sc.nextInt();
al.add(a[i]);
}
Collections.sort(al);
System.out.println("Ascending order is");
for(Integer x:al)
{
System.out.println(x);
}
}
}
