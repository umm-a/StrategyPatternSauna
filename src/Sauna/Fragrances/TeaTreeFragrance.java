package Sauna.Fragrances;

public class TeaTreeFragrance implements Fragrance{
    @Override
    public void smellFragrance() throws InterruptedException {
        System.out.println("A tea tree scent fills the air");
        System.out.print(".");
        Thread.sleep(1000);
        System.out.print(".");
        Thread.sleep(1000);
        System.out.print(".");
        Thread.sleep(1000);
        System.out.println("Fresh!");
    }
}
