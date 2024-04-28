public class Table implements Furniture {
    private final double size = 3.0;
    @Override
    public double getSize() {
        return size;
    }
    @Override
    public void accept(ShippingCostCalculator visitor) {
        visitor.visit(this);
    }
}