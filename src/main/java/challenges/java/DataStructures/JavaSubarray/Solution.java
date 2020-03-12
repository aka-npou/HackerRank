package challenges.java.DataStructures.JavaSubarray;

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[] array = new int[n];

        for (int i=0;i<n;i++) {
            array[i] = scanner.nextInt();
        }

        scanner.close();

        int r=0;

        for (int i=0;i<n;i++) {
            for (int j=1;j<=n;j++) {
                if (isNegative(array, i, j))
                    r++;
            }
        }

        System.out.println(r);
    }

    private static boolean isNegative(int[] array, int i, int j) {

        if (i+j>array.length)
            return false;

        int r=0;

        for (int e=i;e<i+j;e++) {
            r+=array[e];
        }

        return r<0;
    }
}
