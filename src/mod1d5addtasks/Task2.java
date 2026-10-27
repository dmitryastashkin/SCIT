package mod1d5addtasks;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        float x, y;
        Scanner scanner = new Scanner(System.in);
        x = scanner.nextFloat();
        y = scanner.nextFloat();
        if (y<=0.5 && y>0 && x<Math.PI && y<=Math.sin(x) && x>=0) {
            System.out.println("YES");
        }
        else System.out.println("NO");
    }
}

