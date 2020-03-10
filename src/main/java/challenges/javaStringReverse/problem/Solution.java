package challenges.javaStringReverse.problem;

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        System.out.println(isPalindrome(A));
    }

    public static String isPalindrome(String a) {
        String b = new StringBuilder(a).reverse().toString();

        if (a.equals(b))
            return "Yes";
        else
            return  "No";
    }
}
