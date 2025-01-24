import java.util.ArrayList;
import java.util.List;

class Box<T>
{
    T obiekt;

    public void setObiekt(T obiekt)
    {
        this.obiekt = obiekt;
    }
    public T getObiekt()
    {
        return obiekt;
    }
}
class Counter<T>
{
    List<T> lista = new ArrayList<T>();

    public void add(T obiekt)
    {
        lista.add(obiekt);
    }
    public int getCount()
    {
        return lista.size();
    }
}
class Pair<T>
{
    T obiekt1;
    T obiekt2;

    public void setObiekt1(T obiekt1)
    {
        this.obiekt1 = obiekt1;
    }
    public T getObiekt1()
    {
        return obiekt1;
    }
    public void setObiekt2(T obiekt2)
    {
        this.obiekt2 = obiekt2;
    }
    public T getObiekt2()
    {
        return obiekt2;
    }

}
class Main {

    public static class Animal
    {
        private String nazwa;
        private int age;

        public Animal(String nazwa,int age)
        {
            this.nazwa = nazwa;
            this.age = age;
        }


        public void setNazwa(String nazwa)
        {
            this.nazwa = nazwa;
        }
        public String getNazwa()
        {
            return nazwa;
        }
        public void setAge(int age)
        {
            this.age = age;
        }
        public int getAge()
        {
            return age;
        }
    }

    public static class Dog extends Animal
    {
        public Dog(String nazwa,int age)
        {
            super(nazwa, age);
        }
    }
    public static <T extends Animal> T findMax(T el1, T el2)
    {
        return el1.getAge() > el2.getAge() ? el1 : el2;
    }

    public static void findMinMaxAge(Dog tab[], Pair<? super Dog> result)

    {
        Dog min = tab[0];
        Dog max = tab[0];

        for(Dog dog: tab)
        {
            if(dog.getAge() > max.getAge())
            {
                max = dog;
            }
            if(dog.getAge() < min.getAge())
            {
                min = dog;
            }
        }
        result.setObiekt1(min);
        result.setObiekt2(max);

    }

    public static <T> boolean isEqual(T a, T b)
    {
        return a.equals(b);
    }

    public static void main(String[] args)
    {
        /*Box<String> b1 = new Box<>();
        b1.setObiekt("Ala");
        System.out.print(b1.getObiekt() + " ");

        Box<String> b4 = new Box<>();
        b4.setObiekt("Ala");
        System.out.print(b4.getObiekt() + " ");

        Box<Integer> b2 = new Box<>();
        b2.setObiekt(123);
        System.out.print(b2.getObiekt() + " ");

        Box<Integer> b3 = new Box<>();
        b3.setObiekt(123);
        System.out.print(b3.getObiekt() + " ");

        System.out.println(isEqual(b1.getObiekt(), b4.getObiekt()));*/

        Dog dog1 = new Dog("Max", 3);
        Dog dog2 = new Dog("Burek", 4);
        Dog dog3 = new Dog("Zosia", 6);

        Dog max = findMax(dog1, dog2);
        System.out.println(max.getNazwa() + " " + max.getAge());

        Dog[] tab = new Dog[3];
        tab[0] = dog1;
        tab[1] = dog2;
        tab[2] = dog3;
        Pair<Animal> result = new Pair<>();
        findMinMaxAge(tab, result);
        Dog najmlodszy = (Dog) result.getObiekt1();
        Dog najstarszy = (Dog) result.getObiekt2();

        System.out.println(najmlodszy.getAge() + " " + najmlodszy.getNazwa());
        System.out.println(najstarszy.getAge() + " " + najstarszy.getNazwa());

    };

    }
