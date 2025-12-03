package rvt;

import java.util.Scanner;
import java.util.ArrayList;
public class Counter {
    int number;

    public Counter(int startValue) {
        this.number = startValue;
    }
    public Counter() {
        this.number = 0;
    }
    public int value() {
        return number;
    }
    public void increase() {
        this.number += 1;
    }
    public void decrease() {
        this.number -= 1;
    }
    public static void main(String[] args) {
        Counter number = new Counter();
        number.increase();
        System.out.printf("%d", number.value());
    }
}