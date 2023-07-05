import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();

        for (int t = 0; t < T; t++) {
            int n = scanner.nextInt();
            int k = scanner.nextInt(); 

            int[] A = new int[n];
            int[] B = new int[n]; 

            for (int i = 0; i < n; i++) {
                A[i] = scanner.nextInt();
            }

            for (int i = 0; i < n; i++) {
                B[i] = scanner.nextInt();
            }

            long sumProduct = 0;
            for (int i = 0; i < n; i++) {
                sumProduct += (long) A[i] * B[i];
            }

            long minSum = Long.MAX_VALUE;
            for (int i = 0; i < n; i++) {
                long originalProduct = (long) A[i] * B[i];
                long modifiedProduct1 = (A[i] + 2 * k) * B[i];
                long modifiedProduct2 = (A[i] - 2 * k) * B[i];
                long difference1 = Math.abs(modifiedProduct1 - originalProduct);
                long difference2 = Math.abs(modifiedProduct2 - originalProduct);
                long difference = Math.min(difference1, difference2);
                minSum = Math.min(minSum, sumProduct - difference);
            }

            System.out.println(minSum);
        }

        scanner.close();
    }
}
