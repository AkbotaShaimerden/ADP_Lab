package Adapter;

public class LogisticsTest {
    public static void main(String[] args) {
        IInternalDeliveryService internalService = DeliveryServiceFactory.getDeliveryService("Internal");
        IInternalDeliveryService logisticsAService = DeliveryServiceFactory.getDeliveryService("LogisticsA");
        IInternalDeliveryService logisticsBService = DeliveryServiceFactory.getDeliveryService("LogisticsB");


        internalService.deliverOrder("101");
        System.out.println(internalService.getDeliveryStatus("101"));


        logisticsAService.deliverOrder("202");
        System.out.println(logisticsAService.getDeliveryStatus("202"));


        logisticsBService.deliverOrder("303");
        System.out.println(logisticsBService.getDeliveryStatus("303"));
    }
}