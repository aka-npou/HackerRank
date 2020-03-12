package challenges.java.DataStructures.JavaList;

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        List<Integer> l = new ArrayList<>();

        for (int i=0;i<n;i++) {
            l.add(scanner.nextInt());
        }

        int q = scanner.nextInt();

        for (int i=0;i<q;i++) {
            String s = scanner.next();

            if (s.equals("Insert")) {
                int x=scanner.nextInt();
                int y=scanner.nextInt();
                insert(l, x,y);
            } else {
                int x=scanner.nextInt();
                delete(l, x);
            }
        }

        for (Integer i:l) {
            System.out.print(i+" ");
        }
    }

    private static void delete(List<Integer> l, int x) {
        l.remove(x);
    }

    private static void insert(List<Integer> l, int x, int y) {
        l.add(x, y);
    }
}
