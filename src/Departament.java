import java.util.Collections.*;

public abstract class Departament extends MafiaOrganization{
    public abstract void internalControl();

    public class LegalnySprzedawca extends MafiaWorker{
        protected int transactionSummary;

        public LegalnySprzedawca() {
            this.transactionSummary = 0;
        }

        public void makeDeal(){
            System.out.println("Nielegalna transakcja dokonana");
            transactionSummary=transactionSummary+2*VALUE_OF_SINGLE_LEGAL_TRANSACTION;
        }
    }

    public class Kontroler{
        public void check(){
            if(kolorScian=="Zielony"){
                System.out.println("Nie trzeba kontrolowac");
                return;
            }
            System.out.println("Kontroluje");
        }
    }
}
