import java.util.Scanner;
public class zerone {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int zero = 0;
        int one = 0;
        int a = sc.nextInt();
        int[] b = new int[a];
        for (int i = 0; i < b.length; i++) {
            b[i] = sc.nextInt();
        }
        for (int i = 0; i < b.length; i++) {
            if (b[i] == 0)
                zero++;
            if (b[i] == 1)
                one++;
        }
            System.out.println("zero:"+zero);
            System.out.println("one:"+one);

        }
    }


