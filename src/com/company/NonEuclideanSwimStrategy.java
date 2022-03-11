package com.company;

public class NonEuclideanSwimStrategy extends Strategy{
    @Override
    public void action() {
        System.out.println("***starts swimming***");
        plotWait(1000);
        System.out.print("But");
        plotWait();
        System.out.print(".");
        plotWait();
        System.out.print(".");
        plotWait();
        System.out.print(".");
        plotWait(100);
        System.out.println("HE IS LIVING IN YOUR WALLS!!!!!!");
        plotWait();
    }

    private void plotWait() {
        plotWait(800);
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
