public interface Converter {
    public abstract double convertToEuro(double amount);
    public abstract double convertToUSD(double amount);
    public abstract String getConversionRate(String Currency);
}
