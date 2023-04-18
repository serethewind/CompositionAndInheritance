package abstraction;

public class BasePlusCommissionEmployee extends CommissionEmployee {
    private double baseSalary;

    public BasePlusCommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSales, double commissionRate, double baseSalary) {
        super(firstName, lastName, socialSecurityNumber, grossSales, commissionRate);

        this.baseSalary = baseSalary;
    }

    public double getBaseSalary() {
        return baseSalary;
    }


    @Override
    public String toString() {
        return "BasePlusCommissionEmployee{" + super.toString() +
                "baseSalary=" + getBaseSalary() +
                '}';
    }

    public void setBaseSalary(double baseSalary) {
        if (baseSalary < 0){
            throw new IllegalArgumentException("base salary cannot be negative");
        }
        this.baseSalary = baseSalary;
    }

    @Override
    public double getPaymentAmount() {
        return super.getPaymentAmount() + getBaseSalary();
    }
}
