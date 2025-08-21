import java.util.*;
public class splitandsum
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number");
int num=sc.nextInt();
int digits;
int sum=0;
while(num!=0)
{
digits=num%10;
num=num/10;
System.out.println(digits);
sum=sum+digits;
}
System.out.println("sum:"+sum);
}
}
