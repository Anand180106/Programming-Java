import java.util.*;
public class calc
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("1-addition\n 2-subtract\n 3-multiply\n 4-divide");
System.out.println("choose operator");
int operator=sc.nextInt();
System.out.println("Enter the first number");
int n1=sc.nextInt();
System.out.println("Enter the second number");
int n2=sc.nextInt();
double result=0;
switch(operator){
 case 1:

result=n1+n2;
break;

 case 2:

result=n1-n2;
break;

 case 3:

result=n1*n2;
break;

 case 4:

result=n1/n2;
break;

default:
System.out.println("Entered operator is not available");
}
System.out.println("result is="+result);
}
}