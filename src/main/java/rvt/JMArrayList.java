package rvt;
import java.util.*;

public class JMArrayList {

    public static void main(String[] args) {
        // onlyTheseNumbers();
        // listSize();
        // onTheList();
        ArrayList<String> strings = new ArrayList<>();
        strings.add("First");
        strings.add("Second");
        strings.add("Third");
        System.out.println(strings);
        removeLast(strings);
        removeLast(strings);
        System.out.println(strings);

    }
    public static void onlyTheseNumbers() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        while (true) {
            Integer num = Integer.valueOf(scanner.nextLine());
            if (num != -1) {
                numbers.add(num);
            } else {
                break;
            }
        }
        System.out.printf("From where? ");
        int start = Integer.valueOf(scanner.nextLine());
        System.out.printf("To where? ");
        int finish = Integer.valueOf(scanner.nextLine());
        for (int i = start; i < finish+1; i++) {
            System.out.printf("%d\n", numbers.get(i));
        }
    }
    public static void listSize() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> names = new ArrayList<>();
        while (true) {
            String name = String.valueOf(scanner.nextLine());
            if (name.equals("")) {
                break;
            } else {
                names.add(name);
            }
        }
        System.out.printf("In total: %d", names.size());
    }
    public static void onTheList() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> names = new ArrayList<>();
        while (true) {
            String name = String.valueOf(scanner.nextLine());
            if (name.equals("")) {
                break;
            } else {
                names.add(name);
            }
        }
        System.out.printf("Serach for? ");
        String findname = String.valueOf(scanner.nextLine());
        if (names.contains(findname)) {
            System.out.printf("%s was fond!", findname);
        } else {
            System.out.printf("%s was not found!", findname);
        }
    }
    public static void removeLast(ArrayList<String> strings) {
        strings.removeLast();
    }
}
