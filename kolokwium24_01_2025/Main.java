import java.util.*;
public class Main {
    public static <T> boolean IsEqualOrNull(T element1, T element2) {
        if (element1 == element2) {
            return true;
        }
        else if (element1==null&&element2==null) {
            return true;
        }
        else
        {
            return false;
        }
    }
    public static void main(String[] args)
    {
        Car car1 = new Car("panda","fiat",12);
        Car car2 = new Car("panda2","fiat",12);
        System.out.print(IsEqualOrNull(car1,car1));

        Triple triple = new Triple(car1,car2,car1);
        System.out.print(triple.getFirst());
    }
}