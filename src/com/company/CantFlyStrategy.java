package com.company;

public class CantFlyStrategy extends Strategy{
    @Override
    public void action() {
        System.out.println("***looks at you like you're an idiot***");
        plotWait();
        System.out.println("He can not fly...");
        plotWait();
    }
    private void plotWait() {
        plotWait(2000);
    }

    private void plotWait(int milliseconds)
    {
        try {
            Thread.sleep(milliseconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
