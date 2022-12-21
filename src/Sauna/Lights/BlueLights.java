package Sauna.Lights;

import Sauna.AnsiColors;

public class BlueLights extends AnsiColors implements Lights {
    @Override
    public void displayLights() throws InterruptedException {
        System.out.println(ANSI_BLUE + "The sauna is in a shade of blue");
        Thread.sleep(1000);
        System.out.println("I hope you're not feeling blue!" + ANSI_RESET);
    }

    @Override
    public void blink() throws InterruptedException {
        System.out.println(ANSI_BLUE + "Blue lights are blinking");
        Thread.sleep(1000);
        System.out.print("- blink, ");
        Thread.sleep(1000);
        System.out.print("blink, ");
        Thread.sleep(1000);
        System.out.print("blink" + ANSI_RESET);
    }
}
