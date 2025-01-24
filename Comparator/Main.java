import java.util.*;
public class Main {
    public static void main(String[] args)
    {

        List<Samochod> samochody = new ArrayList<>();
        samochody.add(new Samochod("fiat",2004,1500100.9));
        samochody.add(new Samochod("fiat2",2006,9800.9));
        samochody.add(new Samochod("fiat3",2001,8700.9));
        Collections.sort(samochody, new Samochod.Porownanie());

        System.out.println(samochody);
    }
}