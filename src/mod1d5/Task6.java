package mod1d5;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float a = scanner.nextFloat();
        float b = scanner.nextFloat();
        float c = scanner.nextFloat();
        System.out.println(a % 2 == 0 && b % 2 == 0 || b % 2 == 0 && c % 2 == 0 || a % 2 == 0 && c % 2 == 0);
    }
}
