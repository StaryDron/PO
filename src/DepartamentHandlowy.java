import java.util.Random;

public class DepartamentHandlowy extends Departament{
    protected int iloscPieniedzy;

    Random rn = new Random();

    public DepartamentHandlowy() {
        if (rn.nextBoolean()) {
            this.kolorScian ="Zielony";
        }
        else{
            this.kolorScian="Niebieski";
        }
        this.iloscPieniedzy=rn.nextInt(450000)+100000;
    }

    @Override
    public void work(){
        if ((rn.nextInt(100)+1)<=90){
            LegalnySprzedawca worker=new LegalnySprzedawca();
            worker.makeDeal();
        }
        else{
            System.out.println("No deal");
        }
    }

    @Override
    public void internalControl(){
        Kontroler worker = new Kontroler();
        worker.check();
    }

}
