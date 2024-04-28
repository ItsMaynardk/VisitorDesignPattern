public class Chair implements Furniture {
    private final double size = 1;
    @Override
    public double getSize() {
        return size;
    }
    @Override
    public void accept(ShippingCostCalculator visitor) {
        visitor.visit(this);
    }
}