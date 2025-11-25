package rvt;

import java.util.Scanner;

public class Chapter44 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        // ex1(scanner);
        // ex2(scanner);
        // ex3(scanner);
        ex7(scanner);
    }

    public static void ex1(Scanner scanner) {
        String name = String.valueOf(scanner.nextLine());
        String[] names = name.split(" ");
        System.out.printf("%s %s\n", names[0], names[1].toUpperCase());
    }

    public static void ex2(Scanner scanner) {
        String string = String.valueOf(scanner.nextLine());
        
        for (char ch: string.toCharArray()) {
            System.out.printf("%s\n", ch);
        }
    }

    public static void ex3(Scanner scanner) {
        String name = String.valueOf(scanner.nextLine());
        String[] names = name.split(" ");
        if (names[0].equals("Amy") || names[0].equals("Buffy") || names[0].equals("Cathy")) {
            System.out.printf("Ms. %s %s\n", names[0], names[1]);
        } else if (names[0].equals("Elroy") || names[0].equals("Fred") || names[0].equals("Graham")) {
            System.out.printf("Mr. %s %s\n", names[0], names[1]);
        } else {
            System.out.printf("%s %s\n", names[0], names[1]);
        }
    }

    public static void ex4(Scanner scanner) {
        System.out.printf("Enter cook time-> ");
        String time = String.valueOf(scanner.nextLine());
        char[] numbers = time.toCharArray();
        if (numbers.length <= 2) {
            System.out.printf("Your time-> %c%c\n", numbers[0], numbers[1]);
        } else if (numbers.length == 3) {
            System.out.printf("Your time-> %c:%c%c\n", numbers[0], numbers[1], numbers[2]);
        } else if (numbers.length == 4) {
            System.out.printf("Your time-> %c%c:%c%c\n", numbers[0], numbers[1], numbers[2], numbers[3]);
        }
        
    }
    
    public static void ex6(Scanner scanner) {
        while (true) {
            System.out.println("Enter your password:");
            String pwd = scanner.nextLine();
            boolean hasDigit = false;
            for (int i = 0; i < pwd.length(); i++) {
                if (Character.isDigit(pwd.charAt(i))) {
                    hasDigit = true;
                    break;
                }
            }
            if (pwd.length() >= 7 && !pwd.equals(pwd.toLowerCase()) && !pwd.equals(pwd.toUpperCase()) && hasDigit) {
                System.out.println("Acceptable password.");
                break;
            } else {
                System.out.println("That password is not acceptable.\n");
            }
        }
    }

    public static void ex7(Scanner scanner) {
        System.out.print("Enter a word -->");
        String word = scanner.nextLine();
        int spaces = 0;
        while (word.length() > 0) {
            for (int i = 0; i < spaces; i++) {
                System.out.print(" ");
            }
            System.out.println(word);
            spaces++;
            if (word.length() > 2) {
                word = word.substring(1, word.length() - 1);
            } else {
                word = (word.length() == 2) ? word.substring(1, 2) : "";
            }
        }
    }
}
