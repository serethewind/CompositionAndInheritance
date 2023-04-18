package CompostionAndInheritance;

public class CompensationModel {

    private double grossSales;
    private double commissionRate;

    private double baseSalary;

    public double getGrossSales() {
        return grossSales;
    }

    public void setGrossSales(double grossSales) {
        this.grossSales = grossSales;
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    public void setCommissionRate(double commissionRate) {
        this.commissionRate = commissionRate;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public CompensationModel(double grossSales, double commissionRate) {
        this.grossSales = grossSales;
        this.commissionRate = commissionRate;
    }

    public CompensationModel(double grossSales, double commissionRate, double baseSalary) {
        this.grossSales = grossSales;
        this.commissionRate = commissionRate;
        this.baseSalary = baseSalary;
    }

    public double earnings() {
        return 0;
    }
}
