package Sauna.Fragrances;

public class LavenderFragrance implements Fragrance{
    @Override
    public void smellFragrance() throws InterruptedException {
        System.out.print("A lavender scent fills the air");
        System.out.print(".");
        Thread.sleep(1000);
        System.out.print(".");
        Thread.sleep(1000);
        System.out.print(".");
        Thread.sleep(1000);
        System.out.println("Mmm!");
    }
}
