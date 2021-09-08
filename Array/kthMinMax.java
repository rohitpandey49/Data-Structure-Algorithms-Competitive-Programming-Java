package Array;

import java.util.Arrays;
import java.util.Scanner;

public class kthMinMax {
    public static void main(String[] args) {
        int n, k;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of the array: ");
        n = sc.nextInt( );
        int[] a = new int[n];
        System.out.println("Enter elements of the array" );
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt( );
        }
        System.out.println("Enter value of K: " );
        k = sc.nextInt();
        Arrays.sort(a);

        System.out.println("Kth Min is : " + a[k-1]);
        System.out.println("Kth Max is : " + a[n-k]);
    }
}
