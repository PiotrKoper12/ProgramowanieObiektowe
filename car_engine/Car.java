class Car implements Cloneable {
    private String make;
    private String model;
    private Engine engine;

    public Car(String make, String model, Engine engine) {
        this.make = make;
        this.model = model;
        this.engine = engine;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public Engine getEngine() {
        return engine;
    }

    @Override
    public String toString() {
        return "Car{make='" + make + "', model='" + model + "', engine=" + engine + "}";
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Car cloned = (Car) super.clone(); // Płytkie klonowanie obiektu Car
        cloned.engine = (Engine) engine.clone(); // Głębokie klonowanie silnika
        return cloned;
    }
}
