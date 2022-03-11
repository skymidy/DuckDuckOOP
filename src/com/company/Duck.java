package com.company;

public class Duck {

    private Strategy quackStrategy;
    private Strategy swimStrategy;
    private Strategy flyStrategy;
    private Strategy walkStrategy;

    public Duck(Strategy quackStrategy, Strategy swimStrategy, Strategy flyStrategy, Strategy walkStrategy) {
        this.quackStrategy = quackStrategy;
        this.swimStrategy = swimStrategy;
        this.flyStrategy = flyStrategy;
        this.walkStrategy = walkStrategy;
    }

    public void display() {
        System.out.print("Duck: ");
    }

    public void quack() {
        quackStrategy.action();
    }

    public void swim() {
        swimStrategy.action();
    }

    public void fly() {
        flyStrategy.action();
    }

    public void walk() {
        walkStrategy.action();
    }

}
