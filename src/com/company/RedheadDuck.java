package com.company;

public class RedheadDuck extends Duck {

    public RedheadDuck(Strategy quackStrategy, Strategy swimStrategy, Strategy flyStrategy, Strategy walkStrategy) {
        super(quackStrategy, swimStrategy, flyStrategy, walkStrategy);
    }

    @Override
    public void display() {
        System.out.print("Redhead ");
        super.display();
    }
}
