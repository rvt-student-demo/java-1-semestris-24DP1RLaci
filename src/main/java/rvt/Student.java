package rvt;

public class Student extends Person {
    private int credit;
    public Student(String name, String adress) {
        super(name, adress);
    }
    public int credits() {
        return credit;
    }
    public void study() {
        credit++;
    }
    @Override
    public String toString() {
        return super.getName() + "\n  " + super.getAdress() + "\n  Study credits " + this.credit;
    }
}