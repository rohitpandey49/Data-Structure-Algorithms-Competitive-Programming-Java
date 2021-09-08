package Array;

import java.util.Scanner;

public class sort012Value {
    public static void main(String[] args) {
        int n, i;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of the array: ");
        n = sc.nextInt( );
        int[] a = new int[n];
        System.out.println("Enter elements of the array");
        for (i = 0; i < n; i++) {
            a[i] = sc.nextInt( );
        }
        int c0 = 0, c1 = 0, c2 = 0;
        for (i = 0; i < n; i++) {
            if (a[i] == 0)
                c0++;
            else if (a[i] == 1)
                c1++;
            else
                c2++;
        }
        for (i = 0; i < c0; i++) {
            a[i] = 0;
        }
        for (i = c0; i < c0 + c1; i++) {
            a[i] = 1;
        }
        for (i = c0 + c1; i < n; i++) {
            a[i] = 2;
        }
        for (i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }

    }
}
