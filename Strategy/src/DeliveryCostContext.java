public class DeliveryCostContext {
    private ShippingCostCalculatorStrategy strategy;

    public void setStrategy(ShippingCostCalculatorStrategy strategy) {
        this.strategy = strategy;
    }

    public double calculate(double weight, double distance) {
        if (strategy == null) {
            throw new IllegalStateException("Жеткізілім стратегиясы таңдалмаған.");
        }
        return strategy.computeCost(weight, distance);
    }
}
