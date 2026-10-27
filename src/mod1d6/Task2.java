package mod1d6;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        int a, b, c;
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();
        if (a < b && b < c) {
            System.out.print(a + " ");
            System.out.print(b + " ");
            System.out.print(c + " ");
        }
        if (b < a && a < c) {
            System.out.print(b + " ");
            System.out.print(a + " ");
            System.out.print(c + " ");
        }
        if (c < a && a < b) {
            System.out.print(c + " ");
            System.out.print(a + " ");
            System.out.print(b + " ");
        }
        if (c < b && b < a) {
            System.out.print(c + " ");
            System.out.print(b + " ");
            System.out.print(a + " ");
        }
        if (a < c && c < b) {
            System.out.print(a + " ");
            System.out.print(c + " ");
            System.out.print(b + " ");
        }
        if (b < c && c < a) {
            System.out.print(b + " ");
            System.out.print(c + " ");
            System.out.print(a + " ");
        }
    }
}