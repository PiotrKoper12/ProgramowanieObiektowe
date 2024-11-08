import java.lang.Math;

public class Kolokwium
{
    public static boolean dokladnosc(double x,double y,double k)
    {
        if(Math.abs(x-y)<=Math.pow(10,-k))
        {
            return true;
        }
        return false;

    }

    public static int najblizszySasiad(int S)
    {
        for(int i=1;i<S;i++)
        {
            if(i*i>=S)
            {
                return i-1;
            }
        }
        return 1;
    }

    public static float pierwiastek(int S, int n, float k)
    {
        return (float)Math.pow(S,1/n);
    }

    public static int podciag(int[] tab)
    {
        int dlugosc = 1;
        int dlugoscmaks = 1;
        int elementstart = tab[0];
        for(int i=1;i<tab.length;i++)
        {
            if(tab[i]<elementstart)
            {
                dlugosc++;
            }
            else
            {
                if(dlugosc>dlugoscmaks)
                {
                    dlugoscmaks = dlugosc;
                }
                dlugosc = 1;
            }
            elementstart = tab[i];

        }
        if(dlugosc>dlugoscmaks)
        {
            dlugoscmaks = dlugosc;
        }
        return dlugoscmaks;
    }
    public static int podciag(int[] tab,int r)
    {
        int dlugosc = 0;
        int dlugoscmaks = 0;
        int elementstart = tab[0];
        int znalazlo = 0;
        for(int i=1;i<tab.length;i++)
        {
            if(elementstart-tab[i]==r)
            {
                dlugosc++;
                znalazlo = 1;
            }
            else
            {
                if(dlugosc>dlugoscmaks)
                {
                    dlugoscmaks = dlugosc;
                    dlugosc = 0;

                }
                else
                {
                    dlugosc = 0;
                }
            }
            elementstart = tab[i];

        }
        if(dlugosc>dlugoscmaks)
        {
            dlugoscmaks = dlugosc;
        }
        if(znalazlo==1)
        {
            return dlugoscmaks+1;
        }
        return dlugoscmaks;

    }
    public static boolean czyPalindrom(int n)
    {
        float liczba = n;
        int dlugosc=0;
        while(liczba>1)
        {
            dlugosc++;
            liczba /= 10;
        }
        int wyznacznik;
        int pierwszaliczba;
        int ostatnialiczba;

        for(int i=0;i<dlugosc;i++)
        {
            pierwszaliczba = n;
            while(pierwszaliczba>10)
            {
                pierwszaliczba /= 10;
            }


            ostatnialiczba=n;
            ostatnialiczba=ostatnialiczba/10;
            ostatnialiczba=ostatnialiczba*10;
            ostatnialiczba=n-ostatnialiczba;
            if(pierwszaliczba!=ostatnialiczba)
            {
                return false;
            }

            wyznacznik = (int)Math.pow(10,dlugosc-1);
            wyznacznik=wyznacznik*pierwszaliczba;
            n=n-wyznacznik;
            n=n/10;
            dlugosc=dlugosc-2;
        }
        return true;
    }
    public static void palindromLiczbowy(int m)
    {
        int liczbacyfr = (int)Math.pow(10,m);
        int startliczba=(int)Math.pow(10,m-1);
        for(int i=startliczba;i<liczbacyfr;i++)
        {
            for(int j=startliczba;j<liczbacyfr;j++)
            {
                if(czyPalindrom(i * j))
                {
                    System.out.println(i+" * "+j+" = "+i*j);
                }
            }
        }
    }

    public static double pierwiastek(int s2,int  n2, int k2)
    {
        double S = s2;
        double n = n2;
        double k = k2;
        float liczba = (float)Math.pow(S,1/n);
        for(int i=1;i<=k;i++)
        {
            liczba *=10;
        }
        int l = (int)liczba;
        double liczba2=l;
        for(int i=1;i<=k;i++)
        {
            liczba2 /=10;
        }
        return liczba2;

    }
    public static void main(String[] args)
    {
        //System.out.println(dokladnosc(3.0,1.5,2.0));

        //System.out.println(najblizszySasiad(20));

        //System.out.println(pierwiastek(2,3,5));

        /*int[] tab={1,2,0,3,5,1,4};
        System.out.println(podciag(tab));
        int[] tab2={2,0};
        System.out.println(podciag(tab2,2));*/



        //System.out.println(czyPalindrom(147741));


        //palindromLiczbowy(2);



    }
}