import java.util.Random;

public class Zarzad extends MafiaOrganization{
    protected boolean czyMaOjcaChrzestnego;
    private MafiaWorker ojciecChrzestny;

    public Zarzad() {
        this.czyMaOjcaChrzestnego=new Random().nextBoolean();
    }

    @Override
    public void work() {
        if (ojciecChrzestny == null) {
            // Tworzymy klasę anonimową w momencie przypisania do ojciecChrzestny
            ojciecChrzestny = new MafiaWorker() {
                public void bless() { // Specyficzna metoda klasy anonimowej
                    System.out.println("Popieram!");
                }
            };
            // Z prawdopodobieństwem 0.4 wywołujemy metodę bless(), rzutując do klasy anonimowej
            if (new Random().nextDouble() <= 0.4) {
                ((MafiaWorker) ojciecChrzestny).bless(); // Rzutowanie do klasy anonimowej
            }
        }
    }
}
