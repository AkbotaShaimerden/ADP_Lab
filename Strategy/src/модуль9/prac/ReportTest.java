package модуль9.prac;
public class ReportTest {
    public static void main(String[] args) {
        IReport report = new SalesReport();
        report = new DateFilterDecorator(report, "2024-01-01", "2024-12-31");
        report = new SortingDecorator(report, "date");
        report = new CsvExportDecorator(report);

        System.out.println(report.generate());
    }
}