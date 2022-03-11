package com.company;

public class TeleportationStrategy extends Strategy{
    @Override
    public void action() {
        System.out.println("teleports away...");
        plotWait();
        System.out.println("ALREADY IN YOUR WALLS!!!!!!!");
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
