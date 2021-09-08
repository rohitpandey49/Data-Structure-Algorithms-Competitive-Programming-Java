package Array;

import java.util.Scanner;

public class ArrayReversing {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of the array: ");
        n = sc.nextInt( );
        int[] a = new int[n];
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt( );
        }
        int j = n-1;
        for (int i = 0; i < n; i++) {
            b[j] = a[i];
            j = j - 1;
        }
        System.out.println("Original Array is :" );
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println("\nReversed Array is :" );
        for (int i = 0; i < n; i++) {
            System.out.print(b[i] + " ");
        }
    }
}

