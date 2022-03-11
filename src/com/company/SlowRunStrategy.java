package com.company;

public class SlowRunStrategy extends Strategy
{

    @Override
    public void action() {
        System.out.println("Run, but slowly...");
    }
}
