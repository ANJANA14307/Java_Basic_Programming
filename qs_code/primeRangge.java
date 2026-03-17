package qs_code;
public class primeRangge {
    public static void main(String[] args) {
        int start = 1;
        int end = 10;

        for (int i = start; i <= end; i++) {
            if (i <= 1) continue;
            
            boolean isPrime = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.print(i + " ");
            }
        }
    }
}