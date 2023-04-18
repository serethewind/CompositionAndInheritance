package exercise10_16;

public class TestingEmployee {
    public static void main(String[] args) {

        BasePlusCommissionCompensationModel sarah = new BasePlusCommissionCompensationModel(100, 0.5, 1000);
        CommissionCompensationModel pelumi = new CommissionCompensationModel(100, 0.5);
        HourlyCompensationModel chidinma = new HourlyCompensationModel(400, 0.7);
        SalariedCompensationModel noah = new SalariedCompensationModel(4000);

        Employee[] employeeObject = new Employee[]{
                new Employee("Sarah", "Aleshinloye", "1111", sarah),
                new Employee("Pelumi", "Joaquim", "2222", pelumi),
                new Employee("Chidinma", "Afogu", "3333", chidinma),
                new Employee("Noah", "Johnson", "4444", noah)
        };

        for (Employee currentEmployee : employeeObject){
            System.out.println(currentEmployee.toString());
            System.out.println(currentEmployee.earnings());
        }

    }
}
