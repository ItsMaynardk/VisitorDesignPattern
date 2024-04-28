public class Sofa implements Furniture {
    private final double size = 5.0;
    @Override
    public double getSize() {
        return size;
    }
    @Override
    public void accept(ShippingCostCalculator visitor) {
        visitor.visit(this);
    }
}