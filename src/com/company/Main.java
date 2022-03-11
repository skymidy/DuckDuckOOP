package com.company;

import java.util.Objects;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        LoudQuackStrategy loudQuackStrategy = new LoudQuackStrategy();
        FastSwimStrategy fastSwimStrategy = new FastSwimStrategy();
        Strategy normalFlyStrategy = new NormalFlyStrategy();
        Strategy slowRunStrategy = new SlowRunStrategy();


        Duck firstDuck = new MarladDuck(loudQuackStrategy, fastSwimStrategy, normalFlyStrategy, slowRunStrategy);
        Duck strangeDuck = new RedheadDuck(new SilentQuackStrategy(), new NonEuclideanSwimStrategy(), new CantFlyStrategy(), new TeleportationStrategy());

        Scanner in = new Scanner(System.in);

        while (true)
        {
            System.out.print("\nChose Duck (0,1) or type anything to leave: ");
            String duck = in.next();
            Duck chosen;
            switch (duck) {
                case "0" -> {
                    chosen = firstDuck;
                }
                case "1" -> {
                    chosen = strangeDuck;
                }
                default -> {
                    chosen = null;
                }
            }
            if(chosen == null) {
                System.out.println("Bye bye!");
                break;
            }

            chosen.display();
            System.out.print("What he will do? (display, quack, swim, walk or fly): ");
            String command = in.next();

            chosen.display();
            if(Objects.equals(command, "display")){
                System.out.print("I'm ");
                chosen.display();
            }
            else if (Objects.equals(command, "quack")){
                chosen.quack();
            }
            else if (Objects.equals(command, "swim")){
                chosen.swim();
            }
            else if (Objects.equals(command, "fly")){
                chosen.fly();
            }
            else if (Objects.equals(command, "walk")){
                chosen.walk();
            }
        }
    }
}
