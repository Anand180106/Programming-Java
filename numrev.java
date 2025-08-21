import java.util.*;
public class numrev
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number");
int num=sc.nextInt();
int digits;
int count=0;
while(num!=0)
{
digits=num%10;
System.out.println(digits);
num=num/10;
count=count+1;
}
System.out.println("count="+count);
}
}