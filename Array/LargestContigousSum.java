package Array;

import java.util.Scanner;

public class LargestContigousSum {
    public static void main(String[] args) {
        int n, i, maxsum = 0, currsum = 0, start = 0, end = 0, s = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of the array: ");
        n = sc.nextInt( );
        int[] a = new int[n];
        System.out.println("Enter elements of the array");
        for (i = 0; i < n; i++) {
            a[i] = sc.nextInt( );
        }
        //kadane's Algorithms
        for (i = 0; i < n; i++) {
            currsum = currsum + a[i];
            if (maxsum < currsum) {
                maxsum = currsum;
                start = s;
                end = i;
            }
            if (currsum < 0) {
                currsum = 0;
                s = i + 1;
            }
        }
        System.out.println("Max Contagious Sum : " + maxsum);
        System.out.println("Max Contagious Array : ");
        for (i = s; i <= end; i++) {
            System.out.print(a[i] + " ");
        }


    }
}
