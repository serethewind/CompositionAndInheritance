package abstraction;

public class HourlyEmployee extends Employee{

    private double wage;
    private double hours;

    public HourlyEmployee(String firstName, String lastName, String socialSecurityNumber, double wage, double hours) {
        super(firstName, lastName, socialSecurityNumber);
        this.wage = wage;
        this.hours = hours;
    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        if (wage < 0){
            throw new IllegalArgumentException("Wage should not be negative");
        }
        this.wage = wage;
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        if (hours < 0){
            throw new IllegalArgumentException("Hours must be greater than or equal to zero");
        }
        this.hours = hours;
    }

    @Override
    public String toString() {
        return "HourlyEmployee{" + super.toString() +
                "wage=" + wage +
                ", hours=" + hours +
                '}';
    }

    @Override
    public double getPaymentAmount() {
        if (hours <= 40){
            return getHours() * getWage();
        }
        return (40 * getWage()) + ((getHours() - 40) * 1.5 * getWage());
    }
}
