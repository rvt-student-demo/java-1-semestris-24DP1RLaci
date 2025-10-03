package rvt;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        printTriangle(4);
    }
    public static void printSpaces(int number) {
        for (int i = 0; i < number; i ++) {
            System.out.printf(" ");
        }
    }
    public static void printStars(int number) {
        for (int i = 0; i < number; i ++) {
            System.out.printf("*");
        }
    }
    public static void printTriangle(int size) {
        for (int i = 0; i < size; i ++) {
            printSpaces(size - (i+ 1));
            printStars(i + 1);
            System.out.printf("\n");
        }
    }
}