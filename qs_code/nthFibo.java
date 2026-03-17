package qs_code;

public class nthFibo {
    public static void nfibo(int n) {
        if (n <= 0) {
            System.out.println(0);
            return;
        }
        
        int a = 0, b = 1, c;
        
        // Loop runs n-1 times to land exactly on the nth index
        for (int i = 1; i < n; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        System.out.println(b);
    }

    public static void main(String[] args) {
        nfibo(10); // Output: 8
    }
}