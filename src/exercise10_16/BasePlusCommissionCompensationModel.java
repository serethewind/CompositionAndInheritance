package exercise10_16;

public class BasePlusCommissionCompensationModel implements CompensationModel {

    /**
     * d) BasePlusCommissionCompensationModel—For Employees who are paid a base salary
     *      * and commission, this class should contain instance variables grossSales, commissionRate and baseSalary and should implement earnings to return baseSalary + grossSales * commissionRate.
     */
    private double grossSales;
    private double commissionRate;

    private double baseSalary;

    public BasePlusCommissionCompensationModel(double grossSales, double commissionRate, double baseSalary) {
        this.grossSales = grossSales;
        this.commissionRate = commissionRate;
        this.baseSalary = baseSalary;
    }

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

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    @Override
    public String toString() {
        return "grossSales=" + grossSales +
                ", commissionRate=" + commissionRate +
                ", baseSalary=" + baseSalary +
                '}';
    }

    @Override
    public double earnings() {
        return getBaseSalary() + (getGrossSales() * getCommissionRate());
    }
}
