package Sauna.Steam;

public class HighSteam implements Steam{
    @Override
    public void pourWaterOnUnit() throws InterruptedException {
        System.out.println("A lot of water has been poured on the unit.\n");
        Thread.sleep(1000);
        System.out.print("Steam hits ");
        Thread.sleep(1000);
        System.out.print("HOT");
        Thread.sleep(1000);
        System.out.print(" in your face!\n");
    }
}
