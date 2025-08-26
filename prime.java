import java.util.*;
public class prime
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number");
int num=sc.nextInt();
int i;
int count=0;
for(i=1;i<=num;i++)
if(num%i==0)
count++;
if(count==2)
System.out.println("prime number");
else
System.out.println("Not prime number");
}
}