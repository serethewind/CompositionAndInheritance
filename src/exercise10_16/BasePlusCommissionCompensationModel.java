package CompostionAndInheritance;

public class BasePlusCommissionCompensationModel extends CompensationModel{

    public BasePlusCommissionCompensationModel(double grossSales, double commissionRate, double baseSalary) {
        super(grossSales, commissionRate, baseSalary);
    }

    public double earnings(){
        return getBaseSalary() + (getCommissionRate() * getGrossSales());
    }
}
