import java.util.Scanner;

public class DeliveryCostCalculator {
    public static void main(String[] args) {
        DeliveryCostContext deliveryContext = new DeliveryCostContext();
        Scanner input = new Scanner(System.in);

        System.out.println("Жеткізілім түрін таңдаңыз: 1 - Стандартты, 2 - Экспресс, 3 - Халықаралық, 4 - Түнгі");
        String selection = input.nextLine();

        switch (selection) {
            case "1":
                deliveryContext.setStrategy(new StandardDelivery());
                break;
            case "2":
                deliveryContext.setStrategy(new ExpressDelivery());
                break;
            case "3":
                deliveryContext.setStrategy(new InternationalDelivery());
                break;
            case "4":
                deliveryContext.setStrategy(new NightDelivery());
                break;
            default:
                System.out.println("Дұрыс емес таңдау.");
                return;
        }

        System.out.println("Пакеттің салмағын (кг) енгізіңіз:");
        double weight = input.nextDouble();
        if (weight <= 0) {
            System.out.println("Салмақ оң болуы тиіс.");
            return;
        }

        System.out.println("Жеткізілім қашықтығын (км) енгізіңіз:");
        double distance = input.nextDouble();
        if (distance <= 0) {
            System.out.println("Қашықтық оң болуы тиіс.");
            return;
        }

        double totalCost = deliveryContext.calculate(weight, distance);
        System.out.printf("Жеткізілім құны: %.2f%n", totalCost);

        input.close();
    }
}
