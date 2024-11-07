public class InternationalDelivery implements ShippingCostCalculatorStrategy {
    @Override
    public double computeCost(double weight, double distance) {
        return weight * 1.2 + distance * 0.75 + 20; // Өзгертілген коэффициенттер
    }
}
