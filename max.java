import java.util.Scanner;
public class max {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int max=0;
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("array elements");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < size; i++)
            if (max < arr[i] || max == 0)
                max = arr[i];
        System.out.println("max:" + max);
    }
}