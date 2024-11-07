public class StandardDelivery implements ShippingCostCalculatorStrategy {
    @Override
    public double computeCost(double weight, double distance) {
        return weight * 0.4 + distance * 0.05; // Өзгертілген коэффициенттер
    }
}
