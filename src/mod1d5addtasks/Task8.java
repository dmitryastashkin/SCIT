package mod1d5addtasks;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        float x, y;
        Scanner scanner = new Scanner(System.in);
        x = scanner.nextFloat();
        y = scanner.nextFloat();
        if (x>=0 && y<1 && (y<=0 && x*x+y*y<=1 || y>0 && y>=x-1)){
            System.out.println("YES");
        }
        else System.out.println("NO");
    }
}

