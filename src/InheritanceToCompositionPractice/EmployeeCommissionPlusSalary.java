package InheritanceToCompositionPractice;

public class EmployeeCommissionPlusSalary {
    private EmployeeCommission customerDetails;

    private double baseSalary;

    public EmployeeCommissionPlusSalary(EmployeeCommission customerDetails, double baseSalary){
        this.customerDetails = customerDetails;
        this.baseSalary = baseSalary;

    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public EmployeeCommission getCustomerDetails() {
        return customerDetails;
    }

    public void setCustomerDetails(EmployeeCommission customerDetails) {
        this.customerDetails = customerDetails;
    }

    public double totalEarnings() {
//        return getBaseSalary() + (super.getGrossSales() * super.getCommissionRate());
        return getBaseSalary() + customerDetails.earnings();
    }

    @Override
    public String toString() {
        return "EmployeeCommissionPlusSalary{" +
                "customerDetails=" + getCustomerDetails() +
                ", baseSalary=" + getBaseSalary() +
                ", totalEarnings=" + totalEarnings() +
                '}';
    }
}
