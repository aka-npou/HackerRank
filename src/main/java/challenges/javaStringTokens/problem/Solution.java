package challenges.javaStringTokens.problem;

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.
        System.out.println(getStringTokens(s));
        scan.close();
    }

    public static String getStringTokens(String s) {
        s = s.trim();

        if (s.length()==0)
            return "0";

        String[] arrS = s.split("[ !,?._'@]+");

        StringBuilder sb = new StringBuilder();

        sb.append(arrS.length);
        for (String es:arrS) {
            sb.append("\n");
            sb.append(es);
        }

        return sb.toString();
    }
}
