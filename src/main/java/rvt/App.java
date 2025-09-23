package rvt;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        final int skruvjucena = 5;
        final int uzgrievnucena = 3;
        final int paplaknsescena = 1;

        Scanner scanner = new Scanner(System.in);
        System.out.printf("Ievadi preci: ");
        String prece = String.valueOf(scanner.nextLine());
        System.out.printf("Ievadi cenu: ");
        Double cena = Double.valueOf(scanner.nextLine());
        System.out.printf("Ekspress piegāde (0 = nē, 1 = jā): ");
        int piegade = Integer.valueOf(scanner.nextLine());
        scanner.close();
        System.out.printf("Rēķins:\n");
        System.out.printf("     %s %10.2f\n", prece, cena);
        if (cena < 10.0) {
            System.out.printf("     Piegāde: %10.2f\n", 2.0 + piegade * 3.0);
            System.out.printf("     Kopā: %10.2f\n", cena + 2.0 + (piegade * 3.0));
        } else {
            System.out.printf("     Piegāde: %10.2f\n", piegade * 3.0);
            System.out.printf("     Kopā: %10.2f\n", cena + (piegade * 3));
        }
    }
}