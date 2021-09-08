package Array;

import java.util.Scanner;

public class NegativeElementOneSide {
    public static void main(String[] args) {
        int n, temp;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of the array: ");
        n = sc.nextInt( );
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt( );
        }
        int j = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] < 0) {
                temp = a[i];
                a[i] = a[j];
                a[j] = temp;
                j++;
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
