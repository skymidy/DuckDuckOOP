package com.company;

public class Main {

    public static void main(String[] args)
    {
        Duck firstDuck = new MarlladDuck();
        Duck secondDuck = new ReadheadDuck();

        firstDuck.display();
        secondDuck.display();

        firstDuck.quack(2);
        secondDuck.quack(2);

        firstDuck.swim(10);
        secondDuck.swim(10);
    }
}
