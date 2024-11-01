import java.util.Random;
import java.util.*;

public class DepartamentOperacjiSpecjalnych extends Departament{
    private int illegalTransactionValue;

    Random rn = new Random();

    public DepartamentOperacjiSpecjalnych() {
        this.illegalTransactionValue = rn.nextInt(20)+10;
        this.kolorScian="Czerwony";
    }

    public class SprzedawcaNielegalny extends MafiaWorker{
        protected int transactionSummary;

        public SprzedawcaNielegalny() {
            this.transactionSummary = 0;
        }

        public void makeDeal(){
            System.out.println("Nielegalna transakcja dokonana");
            transactionSummary=transactionSummary+illegalTransactionValue;
        }
    }

    public class CzlowiekOdMokrejRoboty{
        public void doJob(){
            System.out.println("Wykonuje mokra robote");
        }
    }

    @Override
    public void work(){
        List<CzlowiekOdMokrejRoboty> workers=new LinkedList<>();

        for(int i=0;i<=2;i++){
            CzlowiekOdMokrejRoboty worker=new CzlowiekOdMokrejRoboty();
            worker.doJob();
            workers.add(worker);
        }
    }

    @Override
    public void internalControl(){
        System.out.println("Kontrola nie jest mozliwa");
    }


}
