package mod1d5addtasks;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        float x, y;
        Scanner scanner = new Scanner(System.in);
        x = scanner.nextFloat();
        y = scanner.nextFloat();
        if (y>x*x-2 && (x>=0 && y<x || x<0 && y<-x) ) {
            System.out.println("YES");
        }
        else System.out.println("NO");
    }
}
