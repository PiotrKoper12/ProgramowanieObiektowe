import java.util.Random;
import java.lang.Math;


public class Zest4
{
    private static int[] zad1(int n, int minWartosc, int maxWartosc)
    {
        Random random = new Random(42);
        int[] tablica = new int[n];
        tablica[0] = minWartosc;
        tablica[n-1] = maxWartosc;

        for(int i=1; i<n-1; i++)
        {
            tablica[i] = random.nextInt(maxWartosc-minWartosc)+minWartosc;
        }



        return tablica;
    }

    private static double[] generujZakres(int n, double minWartosc, double maxWartosc)
    {

        double[] tablica = new double[n];
        tablica[0] = minWartosc;
        tablica[n-1] = maxWartosc;
        double wynikowa = (maxWartosc-minWartosc)/(n-1);

        for(int i=1; i<n-1; i++)
        {
            tablica[i] = tablica[i-1]+wynikowa;
        }

        return tablica;
    }

    private static void Wypisztablice(int[][] tablica, int n, int m)
    {
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<m; j++)
            {
                System.out.print(tablica[i][j]+" ");
            }
            System.out.println();
        }
    }
    private static void IleNieparzystych(int []tab,int n)
    {
        int wynik =0;
        for(int i=0; i<n; i++)
        {
            if(tab[i]%2==1)
            {
                wynik++;
            }
        }
        System.out.println(wynik);
    }
    private static void IleParzystych(int []tab,int n)
    {
        int wynik =0;
        for(int i=0; i<n; i++)
        {
            if(tab[i]%2==0)
            {
                wynik++;
            }
        }
        System.out.println(wynik);
    }
    private static void IleDodatnich(int []tab,int n)
    {
        int wynik =0;
        for(int i=0; i<n; i++)
        {
            if(tab[i]>0)
            {
                wynik++;
            }
        }
        System.out.println(wynik);
    }
    private static void IleUjemnych(int []tab,int n)
    {
        int wynik =0;
        for(int i=0; i<n; i++)
        {
            if(tab[i]<0)
            {
                wynik++;
            }
        }
        System.out.println(wynik);
    }
    private static void IleZerowych(int []tab,int n)
    {
        int wynik =0;
        for(int i=0; i<n; i++)
        {
            if(tab[i]==0)
            {
                wynik++;
            }
        }
        System.out.println(wynik);
    }
    private static void IleMaxymalnych(int []tab,int n)
    {
        int wynik =0;
        int Maks=tab[0];
        for(int i=0; i<n; i++)
        {
            if(tab[i]>Maks)
            {
                Maks=tab[i];
            }
        }
        for(int i=0; i<n; i++)
        {
            if(tab[i]==Maks)
            {
                wynik++;
            }
        }
        System.out.println(wynik);
    }
    private static void IleMinimalnych(int []tab,int n)
    {
        int wynik =0;
        int Min=tab[0];
        for(int i=0; i<n; i++)
        {
            if(tab[i]<Min)
            {
                Min=tab[i];
            }
        }
        for(int i=0; i<n; i++)
        {
            if(tab[i]==Min)
            {
                wynik++;
            }
        }
        System.out.println(wynik);
    }
    private static void IleUnikalnych(int []tab,int n)
    {
        int wynik =0;
        for(int i=0; i<n; i++)
        {
            int iloscwystapien=0;
            for(int j=0;j<n;j++)
            {
                if(tab[i]==tab[j])
                {
                    iloscwystapien++;
                }
            }
            if(iloscwystapien==1)
            {
                wynik++;
            }

        }
    System.out.println(wynik);
    }

    private static void sumaDodatnich(int []tab,int n)
    {
        int wynik =0;
        for(int i=0; i<n; i++)
        {
            if(tab[i]>0)
            {
                wynik=wynik+tab[i];
            }
        }
        System.out.println(wynik);
    }

    private static void sumaUjemnych(int []tab,int n)
    {
        int wynik =0;
        for(int i=0; i<n; i++)
        {
            if(tab[i]<0)
            {
                wynik=wynik+tab[i];
            }
        }
        System.out.println(wynik);
    }

    private static void sumaOdwrotnosci(int []tab,int n)
    {
        int wynik =0;
        for(int i=0; i<n; i++)
        {
            wynik=wynik+1/tab[i];
        }
        System.out.println(wynik);
    }

    private static void sredniaArytmetyczna(int []tab,int n)
    {
        int wynik =0;
        for(int i=0; i<n; i++)
        {
            wynik=wynik+tab[i];
        }
        System.out.println((double)wynik/n);
    }

    private static void sredniaGeometryczna(int []tab,double n)
    {
        int wynik =1;
        for(int i=0; i<n; i++)
        {
            wynik=wynik*tab[i];
        }
        System.out.println(Math.pow(wynik,1/(n-1)));
    }
    private static void sredniaHarmoniczna(int []tab,int n)
    {
        int wynik =0;
        for(int i=0; i<n; i++)
        {
            wynik=wynik+1/tab[i];
        }
        System.out.println(n/wynik);
    }

    private static double[] FunkcjaLiniowa(double []tab,int a,int b)
    {
        for(int i=0; i<tab.length; i++)
        {
            tab[i]=a*tab[i]+b;
        }
        return tab;
    }

    private static double[] FunkcjaKwadratowa(double []tab,int a,int b,int c)
    {
        for(int i=0; i<tab.length; i++)
        {
            tab[i]=a*tab[i]*tab[i]+b*tab[i]+c;
        }
        return tab;
    }

    private static double[] FunkcjaWykladnicza(double []tab,int a)
    {
        for(int i=0; i<tab.length; i++)
        {
            tab[i]=Math.pow(a,tab[i]);
        }
        return tab;
    }
    private static double[] FunkcjaSignum(double []tab)
    {
        for(int i=0; i<tab.length; i++)
        {
            if(tab[i]<0)
            {
                tab[i]=-1;
            }
            if(tab[i]==0)
            {
                tab[i]=0;
            }
            if(tab[i]>0)
            {
                tab[i]=1;
            }
        }
        return tab;
    }


    private static void Najdluzszyciagdodatnich(int []tab,int n)
    {
        int indekspoczatkowyteraz=0;
        int indekspoczatkowy=0;
        int indekskoncowy = 0;
        int wynikteraz=0;
        int wynik = 0;
        boolean prawda = false;

        for(int i=0; i<n; i++)
        {
            if(tab[i]>0)
            {
                if(prawda==false)
                {
                    indekspoczatkowyteraz = i;
                }
                prawda=true;
                wynikteraz++;
            }
            if(tab[i]<=0)
            {
                prawda=false;
                if(wynikteraz>wynik)
                {
                    indekspoczatkowy = indekspoczatkowyteraz;
                    indekskoncowy = i-1;
                    wynik = wynikteraz;
                }

                wynikteraz=0;

            }
        }

        System.out.println("Najdluzszy ciag dodatnich zaczal sie od "+indekspoczatkowy+" indeksu i skonczyl na "+indekskoncowy+" indeksie, oraz mial dlugosc " +
                wynik);
    }

    private static void Najdluzszyciagujemnych(int []tab,int n)
    {
        int indekspoczatkowyteraz=0;
        int indekspoczatkowy=0;
        int indekskoncowy = 0;
        int wynikteraz=0;
        int wynik = 0;
        boolean prawda = false;

        for(int i=0; i<n; i++)
        {
            if(tab[i]<0)
            {
                if(prawda==false)
                {
                    indekspoczatkowyteraz = i;
                }
                prawda=true;
                wynikteraz++;
            }
            if(tab[i]>=0)
            {
                prawda=false;
                if(wynikteraz>wynik)
                {
                    indekspoczatkowy = indekspoczatkowyteraz;
                    indekskoncowy = i-1;
                    wynik = wynikteraz;
                }

                wynikteraz=0;

            }
        }

        System.out.println("Najdluzszy ciag ujemnych zaczal sie od "+indekspoczatkowy+" indeksu i skonczyl na "+indekskoncowy+" indeksie, oraz mial dlugosc " +
                wynik);
    }

    private static int[] odwroctablice(int []tab,int n)
    {
        int pom;
        for(int i=0; i<n/2; i++)
        {
            pom=tab[i];
            tab[i]=tab[n-1-i];
            tab[n-1-i]=pom;
        }
        return tab;
    }

    private static int[] odwroctablice(int []tab,int x,int y)
    {
        int pom;
        for(int i=x; i<y; i++)
        {
            pom=tab[i];
            tab[i]=tab[y-1];
            tab[y-1]=pom;
        }
        return tab;
    }






    public static void main(String[] args)
    {
        int n = 12;
        int minWartosc = 1;
        int maxWartosc = 15;
        int[] tab = zad1(n,minWartosc,maxWartosc);

        for(int i=0; i<tab.length; i++)
        {
            System.out.print(tab[i]+" ");
        }
        System.out.println();
        tab=odwroctablice(tab,4,8);

        for(int i=0; i<tab.length; i++)
        {
            System.out.print(tab[i]+" ");
        }
        System.out.println();



        //int m = 3;
        //int[][] tab2 = {{3,2,1},{6,5,4},{9,8,7}};
        //Wypisztablice(tab2,n,m);




    }
}
