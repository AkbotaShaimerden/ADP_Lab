public class NightDelivery implements ShippingCostCalculatorStrategy {
    private static final double NIGHT_FEE = 25.0; // Түнгі жеткізілім үшін қосымша ақы

    @Override
    public double computeCost(double weight, double distance) {
        return (weight * 0.6 + distance * 0.1) + NIGHT_FEE; // Өзгертілген коэффициенттер
    }
}
