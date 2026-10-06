package mod1d2addtasks;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        int a;
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();
        System.out.println(a%10+(a/10%10)+(a/100));
    }
}

