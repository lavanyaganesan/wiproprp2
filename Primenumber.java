import java.io.*;
import java.util.*;
public class Primenumber
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int a,b,num,j,count=0;
System.out.println("Enter the starting number");
a=sc.nextInt();
System.out.println("Enter the ending number");
b=sc.nextInt();
for(num=a;num<=b;num++)
{
for(j=2;j<num;j++)
{
if(num%j==0)
{
count=0;
break;
}
else
{
count=1;
}
}
if(count==1)
{
System.out.println(num+" ");
}
}
}
}
