package Array;

import java.util.Scanner;

public class MinMaxInArray {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of the array: ");
        n = sc.nextInt( );
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt( );
        }
        int min = a[0];
        int max = a[0];
        for (int i = 0; i < n; i++) {
            if (min > a[i]) {
                min = a[i];
            }
            if (max < a[i]) {
                max = a[i];
            }
        }
        System.out.println("Min: " + min);
        System.out.println("Max: " + max);
    }
}
