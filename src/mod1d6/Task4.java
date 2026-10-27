package mod1d6;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        double a, b;
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();
        b = scanner.nextInt();
        if ((a == 0 && b > 0) || (a > 0 && b >= 0)) {
            System.out.println("any x");
        } else if (a <= 0 && b <= 0) {
            System.out.println("no such x");
        } else if (a > 0) {
            System.out.println("x<-" + String.format("%.1f", (-b) / a) + " or x>" + String.format("%.1f",(-b) / a));
        } else if (a < 0) {
            System.out.println(String.format("%.1f",-((-b) / a)) + "<x<" + String.format("%.1f",(-b) / a));
        }
    }
}