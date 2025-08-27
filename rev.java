import java.util.*;
public class rev
{
static int reverse(int n)
{
int digit,rev=0;
while(n != 0)
{
digit=n%10;
rev=rev*10+digit;
n=n/10;
}
return rev;
}
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number:");
int num=sc.nextInt();	
int res=reverse(num);
System.out.println("The reversed num is:"+res);
}
}
