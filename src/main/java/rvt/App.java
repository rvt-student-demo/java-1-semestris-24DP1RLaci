package rvt;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Ievadiet punktus:\n");
        int punkti = Integer.valueOf(scanner.nextLine());
        if (punkti < 0) {
            System.out.printf("Nav iespejams");
        } else if (punkti > 0 && punkti <= 49) {
            System.out.printf("izgāzās");
        } else if (punkti >= 50 && punkti <= 59 ) {
            System.out.printf("1");
        } else if (punkti >= 60 && punkti <= 69 ) {
            System.out.printf("2");
        } else if (punkti >= 70 && punkti <= 79 ) {
            System.out.printf("3");
        } else if (punkti >= 80 && punkti <= 89 ) {
            System.out.printf("4");
        } else if (punkti >= 90 && punkti <= 100 ) {
            System.out.printf("5");
        } else if (punkti > 100) {
            System.out.printf("Lieliski");
        }
    }
}