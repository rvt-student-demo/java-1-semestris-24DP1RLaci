package rvt;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Statistics statistics = new Statistics();
        Statistics statisticsEven = new Statistics();
        Statistics statisticsOdd = new Statistics();
        while (true) {
            Integer skaitlis = Integer.valueOf(scanner.nextLine());
            if (skaitlis != -1) {
                if (skaitlis % 2 == 0) {
                    statisticsEven.addNumber(skaitlis);
                } else {
                    statisticsOdd.addNumber(skaitlis);
                }
                statistics.addNumber(skaitlis);
            } else {
                break;
            }
        }
        // System.out.println("Count: " + statistics.getCount());
        System.out.println("Sum: " + statistics.sum());
        System.out.println("Sum of even numbers: " + statisticsEven.sum());
        System.out.println("Sum of odd numbers: " + statisticsOdd.sum());
        // System.out.println("Average: " + statistics.average());
    }
}