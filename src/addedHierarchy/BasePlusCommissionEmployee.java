package addedHierarchy;

public class BasePlusCommissionEmployee extends CommissionEmployee {

    private double baseSalary;


    public BasePlusCommissionEmployee(String firstName, String lastName, String bvn, double grossSales, double commissionRate, double baseSalary) {
        super(firstName, lastName, bvn, grossSales, commissionRate); //as a matter of convenience, the super should be written first.
        this.baseSalary = baseSalary;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public double totalEarnings() {
//        return getBaseSalary() + (super.getGrossSales() * super.getCommissionRate());
        return getBaseSalary() + super.earnings();
    }

    public String toString(){
        String string = super.toString();
        return string += ", Total Earnings=" + totalEarnings() +
                '}';
    }

//    @Override
//    public String toString() {
//        return "BasePlusCommissionEmployee{" +
//                "firstName='" + super.getFirstName() + '\'' +
//                ", lastName='" + super.getLastName() + '\'' +
//                ", bvn='" + super.getBvn() + '\'' +
//                ", grossSales=" + super.getGrossSales() +
//                ", commissionRate=" + super.getCommissionRate() +
//                ", baseSalary=" + getBaseSalary() +
//                ", earnings=" + super.earnings() +
//                '}';
//    }
}
