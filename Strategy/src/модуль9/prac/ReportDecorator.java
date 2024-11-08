package модуль9.prac;

abstract class ReportDecorator implements IReport {
    protected IReport report;

    public ReportDecorator(IReport report) {
        this.report = report;
    }

    @Override
    public String generate() {
        return report.generate();
    }
}
