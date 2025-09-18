package rvt;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Give a number:\n");
        int number = Integer.valueOf(scanner.nextLine());
        if (number % 2 == 0) {
            System.out.printf("Number %d is even", number);
        } else {
            System.out.printf("Number %d is odd", number);
        }
    }
}