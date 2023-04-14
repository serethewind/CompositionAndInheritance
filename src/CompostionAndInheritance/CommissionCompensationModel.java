package CompostionAndInheritance;

public class CommissionCompensationModel extends CompensationModel{


    public CommissionCompensationModel(double grossSales, double commissionRate) {
        super(grossSales, commissionRate);
    }

    public double earnings(){
        return getGrossSales() * getCommissionRate();
    }
}
