public interface Furniture {
    double getSize();
    void accept(ShippingCostCalculator visitor);
}