package Adapter.prac;

public class DeliveryServiceFactory {
    public static IInternalDeliveryService getDeliveryService(String serviceType) {
        switch (serviceType) {
            case "Internal":
                return new InternalDeliveryService();
            case "LogisticsA":
                return new LogisticsAdapterA(new ExternalLogisticsServiceA());
            case "LogisticsB":
                return new LogisticsAdapterB(new ExternalLogisticsServiceB());
            default:
                throw new IllegalArgumentException("Unknown delivery service type");
        }
    }
}
