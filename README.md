import java.lang.reflect.Array;
import java.util.ArrayList;


public class Main
{



    private static ArrayList<ArrayList<Integer>> zad7(ArrayList<Integer> tab5)
    {
        ArrayList<ArrayList<Integer>> tablica = new ArrayList<>();


        int wynik=0;

        for(int i = 0; i < tab5.size(); i++)
        {
            boolean prawda=true;
            for(int j = 0;j < i; j++)
            {
                if(tab5.get(i)==tab5.get(j) )
                {
                    prawda = false;
                }
            }
            if (prawda)
            {
                wynik++;
            }
        }
        int []tabela = new int[wynik];
        int k = 0;
        for(int i = 0; i < tab5.size(); i++)
        {

            boolean prawda=true;
            for(int j = 0;j < i; j++)
            {
                if(tab5.get(i)==tab5.get(j) )
                {
                    prawda = false;
                }
            }
            if (prawda)
            {
                tabela[k]=tab5.get(i);
                k++;
            }
        }

        for(int i = 0; i < wynik; i++)
        {
            tablica.add(podfunkcja2(tabela[i]));
        }

        return tablica;
    }


    private static  ArrayList<Integer> podfunkcja2(int n)
    {
        ArrayList<Integer> t2 = new ArrayList<>();
        t2.add(n);
        t2.add(0);
        return t2;
    }

    private static  ArrayList<Integer> podfunkcja3(int n,int m)
    {
        ArrayList<Integer> t2 = new ArrayList<>();
        t2.add(n);
        t2.add(m);
        return t2;
    }





    private static ArrayList<ArrayList<Integer>> zad8(ArrayList<Integer> tab)
    {
        ArrayList<ArrayList<Integer>> tablica = new ArrayList<>();

        int wynik=0;
        for(int i = 0; i < tab.size(); i++)
        {

            boolean prawda=true;
            for(int j = 0;j < i; j++)
            {
                if(tab.get(i)==tab.get(j) )
                {
                    prawda = false;
                }
            }
            if (prawda)
            {
                wynik++;
            }
        }
        int []tabela = new int[wynik*2];


        int k = 0;
        for(int i = 0; i < tab.size(); i++)
        {

            boolean prawda=true;
            for(int j = 0;j < i; j++)
            {
                if(tab.get(i)==tab.get(j) )
                {
                    prawda = false;
                }
            }
            int iloscwystapien = 0;
            for(int m = 0;m < tab.size(); m++)
            {
                if(tab.get(i)==tab.get(m))
                {
                    iloscwystapien++;
                }
            }
            if (prawda)
            {
                tabela[k]=tab.get(i);
                tabela[k+1]=iloscwystapien;
                k=k+2;
            }
        }

        for(int i = 0; i < wynik*2; i+=2)
        {
            tablica.add(podfunkcja3(tabela[i],tabela[i+1]));
        }

        return tablica;
    }





    public static void main(String[] args)
    {

        ArrayList<Integer> tab5 = new ArrayList<Integer>();
        tab5.add(1);
        tab5.add(4);
        tab5.add(5);
        tab5.add(5);
        tab5.add(7);
        tab5.add(7);
        tab5.add(2);
        tab5.add(1);
        tab5.add(3);
        tab5.add(7);



        ArrayList<ArrayList<Integer>> tablica = zad8(tab5);

        System.out.println(tablica);


    }
}
