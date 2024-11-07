public class ExpressDelivery implements ShippingCostCalculatorStrategy {
    @Override
    public double computeCost(double weight, double distance) {
        return (weight * 0.85 + distance * 0.15) + 12; // Өзгертілген коэффициенттер мен қосымша ақы
    }
}