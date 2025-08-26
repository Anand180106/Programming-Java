import java.util.*;
public class greatestof3
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter 1st number");
int a=sc.nextInt();
System.out.println("Enter 2nd number");
int b=sc.nextInt();
System.out.println("Enter 3rd number");
int c=sc.nextInt();
if(a>b && a>c)
{
System.out.println("a is greater:"+a);
}
if(b>a && b>c)
{
System.out.println("b is greater:"+b);
}
if(c>a && c>b)
{
System.out.println("c is greater:"+c);
}
}
}