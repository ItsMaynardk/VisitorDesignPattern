public class FlatRateShippingCalculator implements ShippingCostCalculator {
    private final double baseCost = 28;

    @Override
    public double visit(Furniture furniture) {
        if (furniture instanceof Chair) {
            return baseCost;
        } else if (furniture instanceof Table) {
            return baseCost + 5.0;
        } else {
            return 0.0;
        }
    }
}