package addedHierarchy;

public class HourlyEmployees extends Employee{
    private double hours;
    private double wages;

    public HourlyEmployees(String firstName, String lastName, String bvn, double hours, double wages){
        super(firstName, lastName, bvn);
        validateHours(hours);
        this.hours = hours;
        validateWages(wages);
        this.wages = wages;
    }

    private void validateWages(double wages){
        if (wages < 0){
            throw new IllegalArgumentException("Wages cannot be less than zero");
        }
    }

    private void validateHours(double hours){
        if (hours < 0 || hours > 168){
            throw new IllegalArgumentException("Hours should be between 0 and 168");
        }
    }
    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        validateHours(hours);
        this.hours = hours;
    }

    public double getWages() {
        return wages;
    }

    public void setWages(double wages) {
        validateWages(wages);
        this.wages = wages;
    }

    public double earning(){
        if (getHours() > 40){
            return 1.5 * getHours() * getWages();
        }
        return getHours() * getWages();
    }


    public String toString() {
        String string = super.toString();
        return string += ", HourlyEmployees{" +
                "hours=" + hours +
                ", wages=" + wages +
                ", earnings=" + earning() +
                '}';
    }
}
