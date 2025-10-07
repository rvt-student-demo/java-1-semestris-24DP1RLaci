package rvt;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int[] array = {5, 1, 3, 4, 2};
        printArrayInStars(array);
    }
    public static void printArrayInStars(int[] array) {
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[i]; j++) {
                System.out.printf("*");
            }
            System.out.printf("\n");
        }
    }
}