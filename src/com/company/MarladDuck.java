package com.company;

public class MarladDuck extends Duck {

    public MarladDuck(Strategy quackStrategy, Strategy swimStrategy, Strategy flyStrategy, Strategy walkStrategy) {
        super(quackStrategy, swimStrategy, flyStrategy, walkStrategy);
    }

    @Override
    public void display() {
        System.out.print("Marlad ");
        super.display();
    }
}
