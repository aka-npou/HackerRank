package challenges.ArtificialIntelligence.BotSavesPrincess;

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {

        new Solution().bot();

    }

    public void bot() {

        Point p=null;
        Point m=null;

        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        String[] map = new String[N];

        for (int i=0;i<N;i++) {
            map[i] = scanner.next();

            if (map[i].contains("m")) {
                m = new Point(map[i].indexOf("m"), i);
            }

            if (map[i].contains("p")) {
                p = new Point(map[i].indexOf("p"), i);
            }
        }

        scanner.close();

        while (true) {
            if (m.x>p.x) {
                System.out.println("LEFT");
                m.x--;
                continue;
            }
            if (m.x<p.x) {
                System.out.println("RIGHT");
                m.x++;
                continue;
            }
            if (m.y<p.y) {
                System.out.println("DOWN");
                m.y++;
                continue;
            }
            if (m.y>p.y) {
                System.out.println("UP");
                m.y--;
                continue;
            }
            break;
        }

    }

    class Point {
        int x,y;

        Point(int x, int y) {
            this.x=x;
            this.y=y;
        }
    }
}
