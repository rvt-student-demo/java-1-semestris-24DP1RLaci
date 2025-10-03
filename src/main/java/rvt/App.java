package rvt;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        
    }
    public static void printSpaces(int number) {
        for (int i = 0; i < number; i ++) {
            System.out.printf(" ");
        }
        System.out.printf("\n");
    }
    public static void printStars(int number) {
        for (int i = 0; i < number; i ++) {
            System.out.printf("*");
        }
        System.out.printf("\n");
    }
}