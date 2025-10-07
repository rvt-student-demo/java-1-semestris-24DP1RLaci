package rvt;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int[] numbers = {5, 1, 3, 4, 2};
        sumOfNumbersInArray(numbers);
    }
    public static int sumOfNumbersInArray(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        System.out.printf("%d", sum);
        return sum;
    }
}