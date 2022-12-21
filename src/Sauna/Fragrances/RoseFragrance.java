package Sauna.Fragrances;

public class RoseFragrance implements Fragrance{
    @Override
    public void smellFragrance() throws InterruptedException {
        System.out.println("A rose scent fills the air");
        System.out.print(".");
        Thread.sleep(1000);
        System.out.print(".");
        Thread.sleep(1000);
        System.out.print(".");
        Thread.sleep(1000);
        System.out.println("How lovely!");
    }
}
