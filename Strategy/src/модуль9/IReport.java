package модуль9;

public interface IReport {
    String generate();
}

class SalesReport implements IReport {
    @Override
    public String generate() {
        return "Sales Report: List of sales transactions...";
    }
}

class UserReport implements IReport {
    @Override
    public String generate() {
        return "User Report: List of registered users...";
    }
}
