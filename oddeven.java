import java.util.Scanner;
public class oddeven {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int odd = 0, even = 0;
        System.out.println("Enter the nos");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("enter the array elements");
        for (int ind = 0; ind < size; ind++) {
            arr[ind] = sc.nextInt();
        }
        for (int ind = 0; ind < size; ind++) {
            if (arr[ind] % 2 == 0) {
                System.out.println("even");
                even++;
            }
            if (arr[ind] % 2 == 1) {
                System.out.println("odd");
                odd++;
            }
        }
        System.out.println(even);
        System.out.println(odd);
    }
}

