package mod1d2;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        int a, b, n, full;
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();
        b = scanner.nextInt();
        n = scanner.nextInt();
        full = (b+(a*100))*n;
        System.out.print(full/100 + " ");
        System.out.print(full%100);
    }
}
