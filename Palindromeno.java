import java.io.*;
import java.util.*;
public class Palindromeno
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int a,s,sum,count=0;
System.out.println("Enter the number");
a=sc.nextInt();
sum=a;
while(a>0)
{
s=a%10;
count=(count*10)+s;
a=a/10;
}
if(sum==count)
{
System.out.println(a+" is a palindrome number");
}
else
{
System.out.println(a+" is not a palindrome number");
}
}
}
