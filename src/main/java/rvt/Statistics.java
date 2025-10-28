package rvt;

import java.util.ArrayList;

public class Statistics {
    private int count;
    private int sum;
    private ArrayList<Integer> integers = new ArrayList<Integer>();

    public Statistics() {
        // initialize the variable numberCount here
    }

    public void addNumber(int number) {
        integers.add(number);
        count += 1;
    }

    public int getCount() {
        return count;
    }
    public int sum() {
        sum = 0;
        for (int i = 0; i < integers.size(); i++) {
            sum += integers.get(i);
        }
        return sum;
    }

    public double average() {
        sum = 0;
        for (int i = 0; i < integers.size(); i++) {
            sum += integers.get(i);
        }
        return (double) sum / integers.size();
    }
}