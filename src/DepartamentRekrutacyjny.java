import java.util.Random;
import java.util.*;

public class DepartamentRekrutacyjny extends Departament{
    private final int limitDzienny=5;

    public DepartamentRekrutacyjny() {
        this.kolorScian="Bialy";
    }

    public class Rekruter extends MafiaWorker{
        public void recruit(){
            Random rn=new Random();
            if(rn.nextBoolean()){
                System.out.println("Zrekrutowalem!");
                return;
            }
            System.out.println("Porazka!");
        }
    }

    @Override
    public void work(){
        Set<Rekruter> rekruterzy=new HashSet<>();
        for(int i=0;i<=4;i++){
            Rekruter rekruter=new Rekruter();
            rekruter.recruit();
            rekruterzy.add(rekruter);
        }

    }

    @Override
    public void internalControl(){
        Kontroler worker=new Kontroler();
        worker.check();
    }
}
