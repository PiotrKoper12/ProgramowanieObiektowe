import java.util.Comparator;

public class Samochod {
    String marka;
    int rokProdukcji;
    double cena;
    public Samochod(String marka, int rokProdukcji, double cena)
    {
        this.marka = marka;
        this.rokProdukcji = rokProdukcji;
        this.cena = cena;
    }
    @Override
    public String toString() {
        return marka + " (" + rokProdukcji + ")"+ cena;
    }

    public static class Porownanie implements Comparator<Samochod>
    {
        @Override
        public int compare(Samochod s1, Samochod s2)
        {
            return Integer.compare(s1.rokProdukcji, s2.rokProdukcji);
        }
    }
}
