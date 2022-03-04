package com.company;

public abstract class Duck
{
    abstract void display();
    void quack(int times)
    {
        for (int i = 0; i < times; i++)
        {
            System.out.println("Angry Quack!!");
        }
    }
    void swim(int distance)
    {
        System.out.printf("swims front for %d meters\n", distance);
    }

}
