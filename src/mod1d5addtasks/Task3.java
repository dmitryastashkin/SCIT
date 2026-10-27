package mod1d5addtasks;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        float x, y;
        Scanner scanner = new Scanner(System.in);
        x = scanner.nextFloat();
        y = scanner.nextFloat();
        if (y<2-x*x && (x>=0 && y>=0 || x<0 && y>x) ) {
            System.out.println("YES");
        }
        else System.out.println("NO");
    }
}

