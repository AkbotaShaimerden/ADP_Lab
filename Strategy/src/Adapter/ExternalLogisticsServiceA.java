package Adapter;

public class ExternalLogisticsServiceA {
    public void shipItem(int itemId) {
        System.out.println("Shipping item ID: " + itemId);
    }

    public String trackShipment(int shipmentId) {
        return "Tracking shipment ID: " + shipmentId;
    }
}

// Сторонняя служба логистики B
class ExternalLogisticsServiceB {
    public void sendPackage(String packageInfo) {
        System.out.println("Sending package: " + packageInfo);
    }

    public String checkPackageStatus(String trackingCode) {
        return "Status of package " + trackingCode + ": Delivered";
    }
}
