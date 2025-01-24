import java.util.*;

public class Main
{
    public static void main(String[] args)
    {
        List<Client> clientList = new ArrayList<>();

        clientList.add(new Client("Smith", 2000.0));
        clientList.add(new Client("Johnson", 2000.0));
        clientList.add(new Client("Williams", 1500.0));

        clientList.add(new Company( 100,"TechCorp", 3000.0));
        clientList.add(new Company(50,"SoftInc", 3000.0));

        System.out.println("Oryginalna lista:");
        for (Client client : clientList) {
            System.out.println(client);
        }

        Collections.sort(clientList);

        System.out.println("\nPosortowana lista:");
        for (Client client : clientList) {
            System.out.println(client);
        }


    }
}