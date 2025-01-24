class Engine implements Cloneable {
    private int power;
    private String type;
    private String serialNumber;

    public Engine(int power, String type, String serialNumber) {
        this.power = power;
        this.type = type;
        this.serialNumber = serialNumber;
    }

    public int getPower() {
        return power;
    }

    public String getType() {
        return type;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    @Override
    public String toString() {
        return "Engine{power=" + power + ", type='" + type + "', serialNumber='" + serialNumber + "'}";
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone(); // Płytkie klonowanie wystarczy dla klasy Engine
    }
}
