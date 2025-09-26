package rvt;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.printf("Give Numbers\n");
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int skaits = 0;
        int para = 0;
        int nepara = 0;
        while (true) {
            int sk = Integer.valueOf(scanner.nextLine());
            if (sk == -1) {
                System.out.printf("Adios!\n");
                break;
            } else {
                sum += sk;
                skaits += 1;
                if (sk % 2 == 0) {
                    para += 1;
                } else {
                    nepara += 1;
                }
            }
        }
        System.out.printf("sum: %d\n", sum);
        System.out.printf("numbers: %d\n", skaits);
        System.out.printf("average: %f\n", (double) sum / skaits);
        System.out.printf("even: %d\n", para);
        System.out.printf("odd: %d\n", nepara);
    }
}