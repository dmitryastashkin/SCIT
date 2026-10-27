package mod1d6;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        int x;
        Scanner scanner = new Scanner(System.in);
        x = scanner.nextInt();
        if (x>=0 && x<10) {
            System.out.println("DIGIT");
        }
        else if (x>=10 && x<100) {
            System.out.println("NUM");
        }
        else System.out.println("OTHER");
    }
}