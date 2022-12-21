package Sauna;

import Sauna.Fragrances.Fragrance;
import Sauna.Fragrances.LavenderFragrance;
import Sauna.Fragrances.RoseFragrance;
import Sauna.Fragrances.TeaTreeFragrance;
import Sauna.Lights.BlueLights;
import Sauna.Lights.Lights;
import Sauna.Lights.RedLights;
import Sauna.Lights.WhiteLights;
import Sauna.Steam.HighSteam;
import Sauna.Steam.LowSteam;
import Sauna.Steam.MediumSteam;
import Sauna.Steam.Steam;

import java.util.Scanner;

public class WelcomeToTheSauna {
    Fragrance f;
    Steam s;
    Lights l;
    public Sauna sauna;

    WelcomeToTheSauna() throws InterruptedException {
        System.out.println("Hello and welcome to InteractiveSauna!\n");
        settingsLoop();
        getSaunaExperiences();
    }
            public void getSaunaExperiences() throws InterruptedException {
                boolean run = true;
                Scanner scan = new Scanner(System.in);
                String answer;
                System.out.println("Time to relax in the hot sauna!\nYou can now choose from the following:");
                while (run) {
                    System.out.println("1.Get fragrance experience\n2.Display the lights\n3.Make the lights blink\n4.Pour steam on the unit\n5.Choose new settings\n6.Exit the sauna");
                    answer = scan.nextLine();
                    switch (answer) {
                        case "1" -> sauna.fragrance.smellFragrance();
                        case "2" -> sauna.lights.displayLights();
                        case "3" -> sauna.lights.blink();
                        case "4" -> sauna.steam.pourWaterOnUnit();
                            case "5" -> settingsLoop();
                                case "6" -> exitSauna();
                        default -> System.out.println("Wrong input! Please, try again.");
                    }
                    System.out.println("\n");
                    Thread.sleep(500);
                }
            }
            public void exitSauna() throws InterruptedException {
                Thread.sleep(500);
                System.out.println("Thank you for using the sauna!");
                System.exit(1);
            }
            public Sauna settingsLoop() throws InterruptedException {
                boolean run = true;
                Scanner scan = new Scanner(System.in);
                String answer;
                f = new LavenderFragrance();
                l = new BlueLights();
                s = new LowSteam();
                while (run) {
                    Thread.sleep(500);
                    System.out.println("You have a remote control to set following:\n" +
                            "1.Fragrance\n2.Lights\n3.Steam\n4.Done with settings and ready to use the sauna!(Default settings are Lavender fragrance, Blue lights and Low steam)");
                    answer = scan.nextLine();
                    switch (answer) {
                        case "1" -> f = fragranceLoop();
                        case "2" -> l = lightsLoop();
                        case "3" -> s = steamLoop();
                        case "4" -> run = false;
                        default -> System.out.println("Wrong input! Please, try again.");
                    }
                }
                return sauna = new Sauna(f, l, s);
            }
    public Fragrance fragranceLoop(){
        Scanner scan = new Scanner(System.in);
        String answer;
        Fragrance f;
        while (true){
            System.out.println("Which fragrance?\n1.Lavender\n2.Rose\n3.Tea tree");
            answer = scan.nextLine();
            switch (answer) {
                case "1" -> {
                    f = new LavenderFragrance();
                    return f;
                }
                case "2" -> {
                    f = new RoseFragrance();
                    return f;
                }
                case "3" -> {
                    f = new TeaTreeFragrance();
                    return f;
                }
                default -> System.out.println("Woops, try again");
            }
        }
    }
    public Steam steamLoop(){
        Scanner scan = new Scanner(System.in);
        String answer;
        Steam s;
        while (true){
            System.out.println("Which steam level?\n1.Low\n2.Medium\n3.High");
            answer = scan.nextLine();
            switch (answer) {
                case "1" -> {
                    s = new LowSteam();
                    return s;
                }
                case "2" -> {
                    s = new MediumSteam();
                    return s;
                }
                case "3" -> {
                    s = new HighSteam();
                    return s;
                }
                default -> System.out.println("Woops, try again");
            }
        }
    }
    public Lights lightsLoop(){
        Scanner scan = new Scanner(System.in);
        String answer;
        Lights l;
        while (true){
            System.out.println("What lights?\n1.Blue\n2.Red\n3.White");
            answer = scan.nextLine();
            switch (answer) {
                case "1" -> {
                    l = new BlueLights();
                    return l;
                }
                case "2" -> {
                    l = new RedLights();
                    return l;
                }
                case "3" -> {
                    l = new WhiteLights();
                    return l;
                }
                default -> System.out.println("Woops, try again");
            }
        }
    }
    public static void main (String[]args) throws InterruptedException {
        WelcomeToTheSauna welcome = new WelcomeToTheSauna();
    }
}
