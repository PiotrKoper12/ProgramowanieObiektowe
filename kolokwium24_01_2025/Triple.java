public class Triple<T>{
    T obiekt1;
    T obiekt2;
    T obiekt3;

    public Triple(T obiekt1,T obiekt2,T obiekt3) {
        this.obiekt1 = obiekt1;
        this.obiekt2 = obiekt2;
        this.obiekt3 = obiekt3;
    }

    public T getFirst()
    {
        return obiekt1;
    }
    public T getSecond()
    {
        return obiekt2;
    }
    public T getThird()
    {
        return obiekt3;
    }
}
