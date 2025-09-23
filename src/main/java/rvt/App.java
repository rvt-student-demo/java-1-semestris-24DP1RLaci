package rvt;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        final int skruvjucena = 5;
        final int uzgrievnucena = 3;
        final int paplaknsescena = 1;
        
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Skrūvju skaits: ");
        int skruves = Integer.valueOf(scanner.nextLine());
        System.out.printf("Uzgriežņu skaits: ");
        int uzgriezni = Integer.valueOf(scanner.nextLine());
        System.out.printf("Paplākšņu skaits: ");
        int paplaksnes = Integer.valueOf(scanner.nextLine());
        scanner.close();
        
        if (uzgriezni >= skruves && skruves <= paplaksnes / 2) {
            System.out.printf("Pasūtījums ir kārtībā\n");
        }
        if (uzgriezni < skruves) {
            System.out.printf("Pābaudi pasūtījumu: par maz uzgriežņu\n");
        }
        if (skruves > paplaksnes / 2) {
            System.out.printf("Pārbaudi pasūtījumu: par maz paplākšņu\n");
        }
        System.out.printf("Kopējā cena: %d", (skruves * skruvjucena) + (uzgriezni * uzgrievnucena) + (paplaksnes * paplaknsescena));
    }
}