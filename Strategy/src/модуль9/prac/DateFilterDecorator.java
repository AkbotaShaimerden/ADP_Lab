package модуль9.prac;

public class DateFilterDecorator extends ReportDecorator {
    private String startDate;
    private String endDate;

    public DateFilterDecorator(IReport report, String startDate, String endDate) {
        super(report);
        this.startDate = startDate;
        this.endDate = endDate;
    }

    @Override
    public String generate() {
        return super.generate() + "\nFiltered by dates: " + startDate + " - " + endDate;
    }
}


class SortingDecorator extends ReportDecorator {
    private String criterion;

    public SortingDecorator(IReport report, String criterion) {
        super(report);
        this.criterion = criterion;
    }

    @Override
    public String generate() {
        return super.generate() + "\nSorted by: " + criterion;
    }
}


class CsvExportDecorator extends ReportDecorator {
    public CsvExportDecorator(IReport report) {
        super(report);
    }

    @Override
    public String generate() {
        return super.generate() + "\nExported as CSV.";
    }
}


class PdfExportDecorator extends ReportDecorator {
    public PdfExportDecorator(IReport report) {
        super(report);
    }

    @Override
    public String generate() {
        return super.generate() + "\nExported as PDF.";
    }
}