public class Client implements Comparable<Client>{
    private String lastName;
    private double balance;
    public Client(String lastName, double balance)
    {
        this.lastName = lastName;
        this.balance = balance;
    }
    @Override
    public String toString() {
        return "Client: " + lastName + " | Balance: " + balance;
    }
    @Override
    public int compareTo(Client other)
    {
        int porownanie = Double.compare(this.balance,other.balance);
        if(porownanie == 0)
        {
            return this.lastName.compareTo(other.lastName);
        }
        return porownanie;
    }
}
