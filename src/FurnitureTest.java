public class FurnitureTest {
    public static void main(String[] args) {
        Furniture chair = new Chair();
        Furniture table = new Table();
        Furniture sofa = new Sofa();

        ShippingCostCalculator flatRateCalculator = new FlatRateShippingCalculator();
        ShippingCostCalculator distanceCalculator = new DistanceBasedShippingCalculator();

        System.out.println("Flat Rate Shipping Costs:");
        System.out.println("Chair: ₱" + flatRateCalculator.visit(chair));
        System.out.println("Table: ₱" + flatRateCalculator.visit(table));
        System.out.println("Sofa: Requires a distance-based shipping cost calculation.");

        System.out.println("\nDistance Based Shipping Costs:");
        System.out.println("Chair: ₱" + distanceCalculator.visit(chair) + " Maximum of 10km only.");
        System.out.println("Table: ₱" + distanceCalculator.visit(table) + " Maximum of 15km only.");
        System.out.println("Sofa: ₱" + distanceCalculator.visit(sofa) + " Maximum of 25km only.");
    }
}