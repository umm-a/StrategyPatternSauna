package Sauna.Steam;

public class LowSteam implements Steam{
    @Override
    public void pourWaterOnUnit() throws InterruptedException {
        System.out.println("A little bit of water has been poured on the unit.\n");
        Thread.sleep(1000);
        System.out.print("Steam gently touches your face");
        Thread.sleep(1000);
        System.out.print(".");
        Thread.sleep(1000);
        System.out.print(".");
        Thread.sleep(1000);
        System.out.print(".");
        Thread.sleep(1000);
        System.out.println("feels good!");
    }
}
