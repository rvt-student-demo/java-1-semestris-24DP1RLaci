package rvt;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        divisablebythreeinrange(2, 10);
        
    }
    public static void divisablebythreeinrange(Integer start, Integer end) {
        for (int i = start; i  <= end; i++) {
            if (i % 3 == 0) {
                System.out.printf("%d\n", i);
            }
        }
    }
}