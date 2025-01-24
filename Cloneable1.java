public class Employee implements Cloneable {
    private String name;
    private double[] salaries;

    public Employee(String name, double[] salaries) {
        this.name = name;
        this.salaries = salaries.clone();
    }

    @Override
    public Employee clone() {
        try {
            Employee cloned = (Employee) super.clone();
            cloned.salaries = this.salaries.clone();
            return cloned;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(); 
        }
    }

    // Gettery
    public String getName() {
        return name;
    }

    public double[] getSalaries() {
        return salaries;
    }

    // Metoda main
    public static void main(String[] args) {
        double[] salaries = new double[12];
        for (int i = 0; i < 12; i++) {
            salaries[i] = 1000 + i * 100;
        }

        Employee originalEmployee = new Employee("Jan Kowalski", salaries);

        Employee clonedEmployee = originalEmployee.clone();

        originalEmployee.getSalaries()[5] = 5000;

        System.out.println("Oryginalny pracownik: " + originalEmployee.getName());
        for (int i = 0; i < 12; i++) {
            System.out.print(originalEmployee.getSalaries()[i] + " ");
        }
        System.out.println();

        System.out.println("Sklonowany pracownik: " + clonedEmployee.getName());
        for (int i = 0; i < 12; i++) {
            System.out.print(clonedEmployee.getSalaries()[i] + " ");
        }
    }
}
