package rvt;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int[] numbers = {4,2,9,5,1,6};
        for (int i = 0; i < numbers.length; i++) {
            System.out.printf("%d\n", numbers[i]);
        }
        System.out.printf("\nGive two indices to swap:\n");
        int pirm = Integer.valueOf(reader.nextLine());
        int otrs = Integer.valueOf(reader.nextLine());
        int pirmback = numbers[pirm];
        numbers[pirm] = numbers[otrs];
        numbers[otrs] = pirmback;
        System.out.printf("\n");
        for (int i = 0; i < numbers.length; i++) {
            System.out.printf("%d\n", numbers[i]);
        }
    }
}