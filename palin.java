import java.util.*;
public class palin
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number");
int num=sc.nextInt();
int rev=0;
int n=num;
int digit;
while(n!=0)
{
digit=n%10;
rev=rev*10+digit;
n=n/10;
}
if(rev==num)
System.out.println("palindrome");
else
System.out.println("not palindrome");
}
}

