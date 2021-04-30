import java.util.Random;

public class Kopp {
    int id;
    int sum;
    Terning[] terninger = new Terning[2];

    public Kopp(int id) {
        this.id = id;
        for (int i = 0; i < 2; i++) {
            terninger[i] = new Terning(1);
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }

    void trill() {
        sum = 0;
        Random randoom = new Random();
        for (int i = 0; i < 2; i++) {
            this.sum += terninger[i].verdi = randoom.nextInt(6)+1;
        }
    }

}
