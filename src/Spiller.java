public class Spiller {

    String navn;
    int verdi;

    public Spiller(String navn) {
        this.navn = navn;
    }

    public String getNavn() {
        return navn;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    public int getVerdi() {
        return verdi;
    }

    public void setVerdi(int verdi) {
        this.verdi = verdi;
    }

    void spill(Kopp kopp){
        kopp.trill();
        this.verdi = kopp.sum;
    }

    @Override
    public String toString() {
        return "Spiller{" +
                "navn='" + navn + '\'' +
                ", verdi=" + verdi +
                '}';
    }
}
