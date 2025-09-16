package rvt;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Ievadiet pirmo skaitli:\n");
        int first = Integer.valueOf(scanner.nextLine());
        System.out.printf("Ievadiet otro skaitli:\n");
        int second = Integer.valueOf(scanner.nextLine());
        System.out.printf("Ievadiet treso skaitli:\n");
        int third = Integer.valueOf(scanner.nextLine());
        double sum = (double) (first+second+third) / 3;
        System.out.printf("%.1f", sum);
    }
}