package exercise10_16;

public class SalariedCompensationModel implements CompensationModel{
    private double weeklySalary;

    public double getWeeklySalary() {
        return weeklySalary;
    }

    public SalariedCompensationModel(double weeklySalary) {
        this.weeklySalary = weeklySalary;
    }

    public void setWeeklySalary(double weeklySalary) {
        this.weeklySalary = weeklySalary;
    }

    @Override
    public double earnings() {
        return getWeeklySalary();
    }
}
