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
    public void increase(int increaseBy) {
        this.number += increaseBy;
    }
    public void decrease() {
        this.number -= 1;
    }
    public void decrease(int decreaseBy) {
        this.number -= decreaseBy;
    }
    public static void main(String[] args) {
        Counter number = new Counter();
        number.increase(23);
        number.decrease(2);
        System.out.printf("%d", number.value());
    }
}