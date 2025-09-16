import javax.swing.*;
import java.util.Scanner;
public class PosNeg {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int pos = 0, neg = 0;
        int b = sc.nextInt();
        int[] bc = new int[b];
        System.out.println("enter the array elements");
        for (int i = 0; i<b; i++) {
            bc[i] = sc.nextInt();
        }
        for (int i = 0; i<b; i++)
        {
                if (bc[i] > 0) {
                    System.out.println("positive");
                    pos++;
                }
                if (bc[i] < 0) {
                    System.out.println("negative");
                    neg++;
                }


            }
        System.out.println(pos);
        System.out.println(neg);
        sc.close();
        }
    }

