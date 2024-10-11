import java.util.Arrays;
import java.lang.Math;

public class Main
{
    private static void zad1()
    {
        int n = 10;
        for(int i = 1; i <= n; i++)
        {
            for(int j = i+1; j <= n; j++)
            {
                for(int k = j+1; k <= n; k++)
                {

                        int[] tab={i,j,k};
                        Arrays.sort(tab);
                        if(tab[0]*tab[0]+tab[1]*tab[1]==tab[2]*tab[2])
                        {
                            System.out.println(tab[0]+" "+tab[1]+" "+tab[2]);
                        }


                }
            }
        }
    }

    private static void zad2()
    {
            int n = 3;
            for(int i = 1; i <= n; i++)
            {
                for (int j = 1; j <= n; j++)
                {
                    for (int k = 1; k <= n; k++)
                    {

                        if( j*j - (4*i*k)>=0)
                        {
                            System.out.println("wzór = "+i+"x^2 + "+j+"x + "+k);
                        }
                    }
                }
            }
    }
    private static void zad3()
    {
        int n = 3;
        for(int i = 1; i <= n; i++)
        {
            for (int j = 1; j <= n; j++)
            {
                for (int k = 1; k <= n; k++)
                {
                    if(j*j - (4*i*k)>=0)
                    {
                        if(Math.sqrt(Math.sqrt(j*j - (4*i*k)))==(int)Math.sqrt(Math.sqrt(j*j - (4*i*k))))
                        {
                            System.out.println("wzór = "+i+"x^2 + "+j+"x + "+k);
                        }
                    }

                }
            }
        }
    }
    private static void zad4()
    {
        int k = 10;

        for(int n = 2; n <= k; n++)
        {
            int prawda=1;
            for (int i = 2; i < n; i++)
            {
                if(n%i==0)
                {
                    prawda=0;
                }
            }
            if (prawda==1)
            {
                System.out.println(n+"\n");
            }

        }
    }
    private static void zad5()
    {
        int n = 7;
        int m = 3;
        int k = 10;
        for(int i = (int)Math.pow(k,m-1); i <= Math.pow(k,m); i++)
        {
            if(i%n==0)
            {
                System.out.println(i+"\n");
            }
        }
    }
    private static void zad6()
    {
        int wariant = 2; //mozliwe 1-2
        int n = 5;
        char znak = '*';
        if(wariant == 1)
        {
            for(int i = 1; i <= n; i++)
            {
                for(int j = 1; j <= i; j++)
                {
                    System.out.print(znak);
                }
                System.out.println("\n");
            }
        }
        else
        {
            for(int i = 1; i <= n; i++)
            {
                for(int j = 1; j <= n-i; j++)
                {
                    System.out.print(" ");
                }
                for(int j = 1; j <= i; j++)
                {
                    System.out.print(znak+" ");
                }
                System.out.println("\n");
            }
        }
    }
    private static int zad7(int n)
    {

        int wynik = 1;
        for(int i = 1; i <= n; i++)
        {
            wynik = wynik*i;
        }
        return wynik;
    }
    private static void zad8()
    {
        int n = 5;
        int wynik = 1;
        for(int i = 1; i <= n; i=i+2)
        {
            wynik = wynik*i;
        }
        System.out.println(wynik);
    }
    private static void zad9()
    {
        int n = 5;
        int m=2;
        int wynik = 1;
        for(int i = 1; i <= n; i=i+m)
        {
            wynik = wynik*i;
        }
        System.out.println(wynik);
    }
    private static void zad10()
    {
        int n=5;
        int k=2;
        double wynik = zad7(n)/(zad7(k)*zad7(n-k));
        System.out.println(wynik);
    }
    private static int ciagfib(int n)
    {
        if(n==1||n==0)
        {

            return 1;
        }
        else
        {
            return ciagfib(n-1)+ciagfib(n-2);
        }
    }
    private static void zad11(int n)
    {
        for(int i = 0; i < n; i++)
        {
            System.out.println(ciagfib(i));
        }
    }
    private static void zad12(int n)
    {
        int wynikn=0;
        int wynikp=0;
        int wyniknp=0;
        int wynikkn=0;
        int wyniksn=0;
        double wynikon=0;
        for(int i = 1; i <= n; i++)
        {
            wynikn = wynikn+i;
            if(i%2==0)
            {
                wynikp=wynikp+i;
            }
            if(i%2==1)
            {
                wyniknp=wyniknp+i;
            }
            wynikkn=wynikkn + i*i;
            wyniksn = wyniksn + i*i*i;
            wynikon = wynikon + 1/i;

        }
        System.out.println(wynikn);
        System.out.println(wynikp);
        System.out.println(wyniknp);
        System.out.println(wynikkn);
        System.out.println(wyniksn);
        System.out.println(wynikon);
    }
    private static boolean zad13(String wyraz)
    {
        int dlugoscwyrazu = wyraz.length();
        boolean czyprawda = true;
        for(int i = 0; i < dlugoscwyrazu; i++)
        {
            if(wyraz.charAt(i)!=wyraz.charAt(dlugoscwyrazu-i-1))
            {
                czyprawda = false;
            }
        }
        return czyprawda;
    }


    public static void main(String[] args)
    {




    }
}