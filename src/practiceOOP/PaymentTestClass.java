package practiceOOP;

public class TestClass {
    public static void main(String[] args) {
        Employee noah = new SalariedEmployee("Noah", "Johnson", "1111", 100);
        Employee sarah = new HourlyEmployee("Chidinma", "Afogu", "2222",100, 2 );

        Employee oyin = new BasePlusCommissionEmployee("Sarah", "Aleshinloye", "3333", 20, 1.5, 100);

//        System.out.println(employee2 + "\n");
//        System.out.println(employee3 + "\n");
//        System.out.println(employee1);

        Employee[] employees = new Employee[3];
        employees[0] = noah;
        employees[1] = sarah;
        employees[2] = oyin;

        for (Employee employee : employees){
            if (employee instanceof BasePlusCommissionEmployee){
              BasePlusCommissionEmployee currentEmployee = (BasePlusCommissionEmployee) employee;
                System.out.println(currentEmployee + " is a basePlusCommission Employee");
            }
//            if (employee instanceof SalariedEmployee){
//                SalariedEmployee currentEmployee = (SalariedEmployee) employee;
//            }
            }
        }
    }

