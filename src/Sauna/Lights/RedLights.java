package Sauna.Lights;

import Sauna.AnsiColors;

public class RedLights extends AnsiColors implements Lights{

    @Override
    public void displayLights() throws InterruptedException {
        System.out.println(ANSI_RED + "The sauna is in a shade of red");
        Thread.sleep(1000);
        System.out.println("Red looks warm!" + ANSI_RESET);
    }

    @Override
    public void blink() throws InterruptedException {
        System.out.println("Red lights are blinking");
        Thread.sleep(1000);
        System.out.print(ANSI_RED + "- blink, ");
        Thread.sleep(1000);
        System.out.print("blink, ");
        Thread.sleep(1000);
        System.out.print("blink" + ANSI_RESET);
    }
}
