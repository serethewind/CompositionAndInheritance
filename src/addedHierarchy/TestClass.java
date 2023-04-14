package addedHierarchy;

public class TestClass {
    public static void main(String[] args) {
        System.out.println("First example\n");

        BasePlusCommissionEmployee employee1 = new BasePlusCommissionEmployee("Sarah", "Aleshinloye", "22223456789", 345,0.5, 1000);
        System.out.println(employee1);

        System.out.println("\nSecond example\n");
        HourlyEmployees newEmployee = new HourlyEmployees("Noah", "Johnson", "1234567888", 12, 100);
        System.out.println(newEmployee);
    }

}
