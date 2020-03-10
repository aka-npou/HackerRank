package challenges.javaSubstring.problem;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        int start = in.nextInt();
        int end = in.nextInt();
        System.out.println(getSubString(S, start, end));
    }

    public static String getSubString(String s, int start, int end) {
        return s.substring(start, end);
    }
}

