import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;

public class Terningspill {

    int id;
    Kopp kopp;
    List<Spiller> spillere;
            ;

    public Terningspill(int id, int koppId) {
        this.id = id;
        this.kopp = new Kopp(koppId);
        spillere = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    void leggtTilSpiller(String navn){
        Spiller spiller = new Spiller(navn);
        spillere.add(spiller);
    }

    void spill(){
        for(Spiller s : spillere){
            s.spill(kopp);
        }
       Spiller spiller = spillere.stream()
               .max(Comparator.comparing(Spiller::getVerdi)).orElseThrow(NoSuchElementException::new);

        spillere.stream().forEach(x -> System.out.println(x.toString()));

        System.out.println(spiller.getNavn() + " Er vinneren");


    }


}
