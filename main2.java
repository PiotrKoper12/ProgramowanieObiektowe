import java.lang.Math;
import java.util.Scanner;

public class main2
{

    private static void zad1(){
        System.out.println("23.0+76: " + (23.0 + 76));
        System.out.println("41*2.0+3: " + (41*2.0+3));
        System.out.println("5-33: " + (5-33));
        System.out.println("109%3: " + (109%3));
        System.out.println("50/2: " + (50/2));
        System.out.println("4|2: " + (4|2));
        System.out.println("3^5: " + (3^5));
        System.out.println("7&9: " + (7&9));
    }
    private static void zad2()
    {
        double wynik = ((Math.sqrt(7)-1)/2)+Math.pow(3,3)%2;
        System.out.println((int)wynik);
        double wynik2 = 2004/(1*4);
        System.out.println((int)wynik2);
        double wynik3 = (3+Math.sqrt(3))/((Math.sqrt(5)/2)/3)+1;
        System.out.println((int)wynik3);
        double wynik4 = 23%18%7;
        System.out.println((int)wynik4);
        String imie = "Piotr";
        String nazwisko = "Koper";
        double wynik5 = (nazwisko.length()%imie.length()+1)/Math.sqrt(Math.sqrt(2));
        System.out.println((int)wynik5);
    }

    private static void zad3()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj wyraz ");
        String wyraz1 = scanner.nextLine();
        System.out.print("Podaj wyraz ");
        String wyraz2 = scanner.nextLine();
        System.out.print(wyraz1 + " " + wyraz2);
    }

    private static void zad4()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj liczbe ");
        int liczba1 = scanner.nextInt();
        System.out.print("Podaj wyraz ");
        int liczba2  = scanner.nextInt();
        System.out.print(liczba1+liczba2+"\n");
        System.out.print(liczba1-liczba2+"\n");
        System.out.print(liczba1*liczba2+"\n");
        System.out.print((double)liczba1/liczba2+"\n");
    }
    private static void zad5()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj liczbe ");
        int liczba = scanner.nextInt();

        System.out.print(liczba+140+"\n");
        System.out.print(liczba-140+"\n");
        System.out.print(liczba*7+"\n");
        System.out.print(liczba/13+"\n");
        System.out.print(liczba%7+"\n");
        System.out.print((int)liczba/4+"\n");
        System.out.print(Math.pow(liczba,45)+"\n");
        System.out.print(liczba&67);
        System.out.print("\n");
        System.out.print(liczba|59);
        System.out.print("\n");
        System.out.print(liczba^7);
        System.out.print("\n");
        System.out.print(liczba<<5);
        System.out.print("\n");
        System.out.print(liczba>>6);



    }


    public static void main(String[] args)
    {
        System.out.println("Welcome");
        System.out.println("Good luck");

            System.out.println("\nZad1");
            zad1();
            System.out.println("\nZad2");
            zad2();
            System.out.println("\nZad3");
            zad3();
            System.out.println("\nZad4");
            zad4();
            System.out.println("\nZad5");
            zad5();

    }
}