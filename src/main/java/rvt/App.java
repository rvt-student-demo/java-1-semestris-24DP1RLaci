package rvt;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Ievadiet pirmo skaitli:`\n");
        int first = Integer.valueOf(scanner.nextLine());
        System.out.printf("Ievadiet otro skaitli:\n");
        int second = Integer.valueOf(scanner.nextLine());
        System.out.printf("%d + %d = %d",first, second, first+second);
    }
}
