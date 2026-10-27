package mod1d5addtasks;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        float x, y;
        Scanner scanner = new Scanner(System.in);
        x = scanner.nextFloat();
        y = scanner.nextFloat();
        if (y > 1-x && (x>=0 && x<1 || (x<0 && y>2*x*x))) {
            System.out.println("YES");
        }
        else System.out.println("NO");
    }
}

