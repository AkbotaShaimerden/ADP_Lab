package Adapter;

public interface IInternalDeliveryService {
    void deliverOrder(String orderId);
    String getDeliveryStatus(String orderId);
}

class InternalDeliveryService implements IInternalDeliveryService {
    @Override
    public void deliverOrder(String orderId) {
        System.out.println("Internal delivery of order: " + orderId);
    }

    @Override
    public String getDeliveryStatus(String orderId) {
        return "Status of order " + orderId + ": In progress";
    }
}
