package rvt;

import java.util.Scanner;
import java.util.Random;

public class App {
    int number;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int cipars = random.nextInt(6) + 1;
        Boolean uzvareja = false;
        System.out.printf("Es domāju par skaitli no 1 līdz 10.\nTev tas jāuzmin trīs mēģinājumos.\nIevadi minējumu:\n");
        for (int i = 0; i < 3; i ++) {
            int value = Integer.valueOf(scanner.nextLine());
            if (cipars == value) {
                System.out.printf("Pareizi!\nTu esi uzvarējis spēli\n");
                uzvareja = true;
                break;
            } else {
                System.out.printf("Nepareizi\n");
            }
        }
        if (!uzvareja) {
            System.out.printf("Pareizais skaitlis bija %d.\nTu esi zaudējis spēli.\n", cipars);
        }
    }
}