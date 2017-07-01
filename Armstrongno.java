import java.io.*;
import java.util.*;
public class Armstrongno
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int a,sum=0,count;
int n;
System.out.println("Enter the number");
n=sc.nextInt();
count=n;
while(n>0)
{
a=n%10;
n=n/10;
sum=sum+(a*a*a);
}
if(count==sum)
{
System.out.println(count+" is an Armstrong number");
}
else
{
System.out.println(count+" is not an Armstrong number");
}
}
}
