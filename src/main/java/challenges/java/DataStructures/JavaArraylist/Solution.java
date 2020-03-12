package challenges.java.DataStructures.JavaArraylist;

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        ArrayList<ArrayList<Integer>> array = new ArrayList<>();

        for (int i=0;i<n;i++) {
            ArrayList<Integer> curArray = new ArrayList<>();

            int d = scanner.nextInt();

            for (int j=0;j<d;j++) {
                curArray.add(scanner.nextInt());
            }

            array.add(curArray);
        }

        int q = scanner.nextInt();

        for (int i=0;i<q;i++) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();

            try {
                System.out.println(array.get(x-1).get(y-1));
            } catch (Exception e) {
                System.out.println("ERROR!");
            }
        }
    }
}
