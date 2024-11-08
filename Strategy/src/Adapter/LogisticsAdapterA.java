package Adapter;

public class LogisticsAdapterA implements IInternalDeliveryService {
    private ExternalLogisticsServiceA externalService;

    public LogisticsAdapterA(ExternalLogisticsServiceA externalService) {
        this.externalService = externalService;
    }

    @Override
    public void deliverOrder(String orderId) {
        externalService.shipItem(Integer.parseInt(orderId));
    }

    @Override
    public String getDeliveryStatus(String orderId) {
        return externalService.trackShipment(Integer.parseInt(orderId));
    }
}


class LogisticsAdapterB implements IInternalDeliveryService {
    private ExternalLogisticsServiceB externalService;

    public LogisticsAdapterB(ExternalLogisticsServiceB externalService) {
        this.externalService = externalService;
    }

    @Override
    public void deliverOrder(String orderId) {
        externalService.sendPackage("Package for order ID: " + orderId);
    }

    @Override
    public String getDeliveryStatus(String orderId) {
        return externalService.checkPackageStatus(orderId);
    }
}
