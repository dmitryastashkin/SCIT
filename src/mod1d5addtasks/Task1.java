package mod1d5addtasks;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        float x, y;
        Scanner scanner = new Scanner(System.in);
        x = scanner.nextFloat();
        y = scanner.nextFloat();
        if (x*x+y*y>=4 && y<=x &&x<=2 && y>=0) {
            System.out.println("YES");
        }
        else System.out.println("NO");
    }
}

