package advancedOOP;

public class EmployeeTest {
    public static void main(String[] args) {
        Date birthDate = new Date(8, 11, 1990);
        Date hireDate = new Date();
        hireDate.setDay(31);
        hireDate.setMonth(11);
        hireDate.setYear(2021);
        Date weddingDate = new Date(31, 2, 2016);

        Employee newEmployee = new Employee("Sarah", "Adelola", "22234567890", Gender.FEMALE, birthDate, hireDate, weddingDate);
        newEmployee.displayMethod();
    }

}