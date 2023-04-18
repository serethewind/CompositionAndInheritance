package exercise10_16;

public class HourlyCompensationModel implements CompensationModel{

    private double wage;
    private double hours;

    public HourlyCompensationModel(double wage, double hours) {
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
    public double earnings() {
        if (hours <= 40){
            return getHours() * getWage();
        }
        return (40 * getWage()) + ((getHours() - 40) * 1.5 * getWage());
    }
}
