package mod1d5;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float a = scanner.nextFloat();
        System.out.println((a>=-3 && a<=5 || a>=9 && a<=15));
    }
}
