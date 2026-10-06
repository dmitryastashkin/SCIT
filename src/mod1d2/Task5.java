package mod1d2;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        int a;
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();
        System.out.print(a/3600%24 + ":" + (a-(86400*(a/86400)))/60%60/10 + "" + (a-(86400*(a/86400)))/60%60%10 + ":" + (a-(86400*(a/86400)))%60%60/10 + "" + (a-(86400*(a/86400)))%10);
    }
}
