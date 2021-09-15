package Array;

public class CyclicallyRotate {
    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 5};
        int n = a.length;
        int x = a[n - 1];
        for (int i = n - 1; i > 0; i--) {
            a[i] = a[i - 1];
        }
        a[0] = x;
        System.out.println("Rotated array is: ");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
    }

}

