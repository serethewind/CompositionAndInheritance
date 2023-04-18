package exercise10_16;

public interface CompensationModel {


    /**
     * SalariedCompensationModel—For Employees who are paid a fixed weekly salary, this
     * class should contain a weeklySalary instance variable, and should implement method
     * earnings to return the weeklySalary.
     * b) HourlyCompensationModel—For Employees who are paid by the hour and receive overtime pay for all hours worked in excess of 40 hours per week, this class should contain
     * wage and hours instance variables, and should implement method earnings based on
     * the number of hours worked (see class HourlyEmployee’s earnings method in
     * Fig. 10.6).
     * c)
     * d) BasePlusCommissionCompensationModel—For Employees who are paid a base salary
     * and commission, this class should contain instance variables grossSales, commissionRate and baseSalary and should implement earnings to return baseSalary + grossSales * commissionRate.
     *
     * @return
     */
    double earnings();
}
