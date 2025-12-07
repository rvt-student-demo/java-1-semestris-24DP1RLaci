package rvt;

import java.util.Scanner;

public class App {
    int number;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Value of the gift?\n");
        Integer value = Integer.valueOf(scanner.nextLine());
        if (value < 5000) {
            System.out.printf("No tax\n");
        } else if (value < 25000) {
            System.out.printf("Tax: %.0f\n", (double) (100 + (value - 5000) * 0.08));
        } else if (value < 55000) {
            System.out.printf("Tax: %.0f\n", (double) (1700 + (value - 25000) * 0.10));
        } else if (value < 200000) {
            System.out.printf("Tax: %.0f\n", (double) (4700 + (value - 55000) * 0.12));
        } else if (value < 1000000) {
            System.out.printf("Tax: %.0f\n", (double) (22100 + (value - 200000) * 0.15));
        } else {
            System.out.printf("Tax: %.0f\n", (double) (142100 + (value - 1000000) * 0.17));
        }
    }
}