public class Company extends Client{
    private int numberOfEmployees;
    public Company(int numberOfEmployees,String lastName, double balance)
    {
        super(lastName,balance);
        this.numberOfEmployees = numberOfEmployees;
    }

    @Override
    public int compareTo(Client other)
    {
        if (other instanceof Company)
        {
            Company otherCompany = (Company) other;

            int balanceComparison = super.compareTo(other);
            if (balanceComparison != 0) {
                return balanceComparison;
            }

            return Integer.compare(this.numberOfEmployees, otherCompany.numberOfEmployees);
        }
        return super.compareTo(other);
    }
}
