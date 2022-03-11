package com.company;

public class SilentQuackStrategy extends Strategy{
    @Override
    public void action() {
        System.out.println("***an awkward silence***");
    }
}
