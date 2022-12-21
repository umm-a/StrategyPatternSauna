package Sauna.Steam;

public class MediumSteam implements Steam{
    @Override
    public void pourWaterOnUnit() throws InterruptedException {
        System.out.println("Pretty much water has been poured on the unit.\n");
        Thread.sleep(1000);
        System.out.println("Steam hits you quite warm in your face");
        Thread.sleep(1000);
        System.out.print(".");
        Thread.sleep(1000);
        System.out.print(".");
        Thread.sleep(1000);
        System.out.print(".");
        Thread.sleep(1000);
        System.out.println("almost too warm!");
    }
}
