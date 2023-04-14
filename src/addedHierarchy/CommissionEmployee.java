package addedHierarchy;

public class CommissionEmployee extends Employee {
    private double grossSales;
    private double commissionRate;

    public CommissionEmployee(String firstName, String lastName, String bvn, double grossSales, double commissionRate) {
       super(firstName, lastName, bvn);
        validateGrossSales(grossSales);
        this.grossSales = grossSales;
        validateCommissionRate(commissionRate);
        this.commissionRate = commissionRate;
    }


    private void validateGrossSales(double sales){
        if (sales < 0){
            throw new IllegalArgumentException("Sales has to be 0 or more");
        }
    }

    private void validateCommissionRate(double rates){
        if (rates < 0 || rates > 1){
            throw new IllegalArgumentException("Your commission rate has to be between 0 and 1");
        }
    }

    public double getGrossSales() {
        return grossSales;
    }

    public void setGrossSales(double grossSales) {
        validateGrossSales(grossSales);
        this.grossSales = grossSales;
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    public void setCommissionRate(double commissionRate) {
        validateCommissionRate(commissionRate);
        this.commissionRate = commissionRate;
    }

    public double earnings (){
        return getGrossSales() * getCommissionRate();
    }

        public String toString(){
        String string = super.toString();
        return string += ", gross sales=" + getGrossSales() + ", commission rate=" + getCommissionRate() + ", earnings=" + earnings() +
                '}';
    }

//    @Override
//    public String toString() {
//        return "CommissionEmployee{" +
//                "firstName='" + super.getFirstName() + '\'' +
//                ", lastName='" + super.getLastName() + '\'' +
//                ", bvn='" + super.getBvn() + '\'' +
//                ", grossSales=" + getGrossSales() +
//                ", commissionRate=" + getCommissionRate() +
//                ", earnings=" + earnings() +
//                '}';
//    }
}
