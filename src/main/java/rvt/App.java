package rvt;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        christmasTree(10);
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
    public static void christmasTree(int height) {
        for (int i = 0; i < height; i ++) {
            printSpaces(height - (i + 1));
            printStars(i + 1 + i*1);
            System.out.printf("\n");
        }
        for (int i = 0; i < 2; i ++) {
            printSpaces(height - 2);
            printStars(3);
            System.out.printf("\n");
        }
    }
}