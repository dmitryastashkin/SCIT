package mod1d6;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        int a;
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();

        if ((a > 5 && a < 21) || a % 100 == 11 || a % 100 == 13 || a % 100 == 14 || a % 10 == 6 || a % 10 == 0 || a % 10 == 7 || a % 10 == 5 || a % 10 == 8 || a % 10 == 9) {
            System.out.println(a + " TORTOV");
        }
        else if (a % 10 == 1) {
            System.out.println(a + " TORT");
        }
        else if (a % 10 == 2 || a % 10 == 4 || a % 10 == 3) {
            System.out.println(a + " TORTA");
        }
    }
}