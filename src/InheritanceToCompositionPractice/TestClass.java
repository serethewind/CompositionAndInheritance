package InheritanceToCompositionPractice;

public class TestClass {
    public static void main(String[] args) {
        EmployeeCommission customerDetails = new EmployeeCommission("Noah", "Johnson", "12345678912", 30, 0.7);
        EmployeeCommissionPlusSalary newEmployee = new EmployeeCommissionPlusSalary(customerDetails, 2000);
        System.out.println(newEmployee);
    }


}
