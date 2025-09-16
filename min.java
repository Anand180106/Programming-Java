import java.util.Scanner;
public class min {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int min=0;
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("array elements");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < size; i++)
            if (min > arr[i] || min == 0)
                min = arr[i];
        System.out.println("min:" + min);
    }
}