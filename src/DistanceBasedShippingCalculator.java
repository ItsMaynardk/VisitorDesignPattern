public class DistanceBasedShippingCalculator implements ShippingCostCalculator {
    private final double costPerKm = 5;

    @Override
    public double visit(Furniture furniture) {
        if (furniture instanceof Chair) {
            return costPerKm * 10;
        } else if (furniture instanceof Table) {
            return costPerKm * 15;
        } else if (furniture instanceof Sofa) {
            return costPerKm * 25;
        } else {
            throw new UnsupportedOperationException("Distance based shipping not implemented for " + furniture.getClass().getSimpleName());
        }
    }
}