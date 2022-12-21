package Sauna.Lights;

import Sauna.AnsiColors;

public class WhiteLights extends AnsiColors implements Lights{
    @Override
    public void displayLights() throws InterruptedException {
        System.out.println(ANSI_BLACK_BACKGROUND + "The sauna is white-colored");
        Thread.sleep(1000);
        System.out.println("What a neat color!" + ANSI_RESET);
    }

    @Override
    public void blink() throws InterruptedException {
        System.out.println("White lights are blinking");
        Thread.sleep(1000);
        System.out.print(ANSI_BLACK_BACKGROUND + "- blink, ");
        Thread.sleep(1000);
        System.out.print("blink, ");
        Thread.sleep(1000);
        System.out.print("blink" + ANSI_RESET);
    }
}
