import java.util.*;
public class splitLR
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number");
int num=sc.nextInt();
int n=num;
int digits;
int count=0;
while(n>0)
{
count=count+1;
n=n/10;
}
System.out.println("count="+count);
n=num;
while(n>0)
{
digits=n/(int)Math.pow(10,count-1);
System.out.println(digits);
n=n%(int)Math.pow(10,count-1);
--count;
}
}
}


