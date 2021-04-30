import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        lagSpill();
    }

     static void lagSpill(){

        Terningspill terningspill = new Terningspill(1,1);


        String Matias = "Matias";
        String Simon = "Simon";
        String Christian = "Christian";

        List<String> deltakerListe = new ArrayList<>();

        deltakerListe.add(Matias);
        deltakerListe.add(Simon);
        deltakerListe.add(Christian);

        for(String s : deltakerListe){
            terningspill.leggtTilSpiller(s);
        }

        terningspill.spill();


    }
}
