import java.util.Scanner;
public class MeanAvg
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int sum=0;
        double avg;
        int a=sc.nextInt();
        int b[]=new int[a];
        for(int i=0;i<b.length;i++)
        {
        b[i]=sc.nextInt();
            sum = sum + b[i];
        }
        int j= b.length;
        avg=sum/j;
        System.out.println("sum:"+sum);
        System.out.println("avg:"+avg);

    }
}