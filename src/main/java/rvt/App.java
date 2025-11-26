package rvt;

import java.util.Scanner;
import java.util.ArrayList;
public class App {
    String name;
    Integer pages;
    Integer releaseYear;

    public App(String name, Integer pages, Integer releaseYear) {
        this.name = name;
        this.pages = pages;
        this.releaseYear = releaseYear;
    }
    public void printinfo() {
        System.out.printf("%s, %s, %s", name, pages, releaseYear);
    }
    public void printname() {
        System.out.printf("%s", name);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<App> books = new ArrayList<>();
        while (true) {
            System.out.printf("Title: ");
            String name = String.valueOf(scanner.nextLine());
            if (!(name.equals(""))) {
                System.out.printf("Pages: ");
                Integer pages = Integer.valueOf(scanner.nextLine());
                System.out.printf("Publication year: ");
                Integer year = Integer.valueOf(scanner.nextLine());
                books.add(new App(name, pages, year));
            } else {
                break;
            }
        }
        System.out.printf("\nWhat information will be printed? ");
        String answer = String.valueOf(scanner.nextLine());
        if (answer.equals("everything")) {
            for (App b : books) {
                b.printinfo();
            }
        } else if (answer.equals("name")) {
            for (App b : books) {
                b.printname();
            }
        }
        
    }
}