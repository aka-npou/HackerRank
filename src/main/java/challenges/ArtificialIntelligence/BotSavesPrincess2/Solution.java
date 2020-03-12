package challenges.ArtificialIntelligence.BotSavesPrincess2;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static void nextMove(int n, int r, int c, String [] grid){

        int px=0, py=0;
        int mx=0, my=0;

        for(int i = 0; i < n; i++) {

            if (grid[i].contains("m")) {
                my=i;
                mx=grid[i].indexOf("m");
            }

            if (grid[i].contains("p")) {
                py=i;
                px=grid[i].indexOf("p");
            }
        }

        if (mx>px) {
            System.out.println("LEFT");
            return;
        }
        if (mx<px) {
            System.out.println("RIGHT");
            return;
        }
        if (my<py) {
            System.out.println("DOWN");
            return;
        }
        if (my>py) {
            System.out.println("UP");
            return;
        }
    }

    public static void main(String[] args) {
        new Solution().bot();
    }

    public void bot() {
        Scanner in = new Scanner(System.in);
        int n,r,c;
        n = in.nextInt();
        r = in.nextInt();
        c = in.nextInt();
        in.useDelimiter("\n");
        String grid[] = new String[n];


        for(int i = 0; i < n; i++) {
            grid[i] = in.next();
        }

        nextMove(n,r,c,grid);

    }

    class Point {
        int x,y;

        Point(int x, int y) {
            this.x=x;
            this.y=y;
        }
    }
}
