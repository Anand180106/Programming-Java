import java.util.*;
public class pali
{
static Boolean isPalindrome(int num)
{
int digit,rev=0,copynum=num;
while(copynum != 0)
{
digit=copynum%10;
rev=rev*10+digit;
copynum=copynum/10;
}
return num==rev;
}
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number:");
int num=sc.nextInt();
Boolean res= isPalindrome(num);
if(res == true)
{
System.out.println("Palindrome");
}
else
{
System.out.println("Not palindrome");
}
sc.close();
}
}
