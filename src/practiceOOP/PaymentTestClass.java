package practiceOOP;

public class PaymentTestClass {
    public static void main(String[] args) {

//        Employee noah = new SalariedEmployee("Noah", "Johnson", "1111", 40000);
//        Employee sarah = new HourlyEmployee("Chidinma", "Afogu", "2222", 2500, 8);
//        Employee pelumi = new CommissionEmployee("Pelumi", "Joaquim", "3333", 500, 0.7);
//        Employee oyin = new BasePlusCommissionEmployee("Sarah", "Aleshinloye", "4444", 20, 1.5, 100);
//        System.out.println(employee2 + "\n");
//        System.out.println(employee3 + "\n");
//        System.out.println(employee1);
//        Employee[] employees = new Employee[4];
//        employees[0] = noah;
//        employees[1] = sarah;
//        employees[2] = pelumi;
//        employees[3] = oyin;
//     for (Employee employee : employees) {
//            if (employee instanceof BasePlusCommissionEmployee) {
//                BasePlusCommissionEmployee currentEmployee = (BasePlusCommissionEmployee) employee;
//                System.out.println(currentEmployee + " is a basePlusCommission Employee");
//            }
//
//        }

        Payable[] payableObjects = new Payable[]{
                new Invoice("01111", "Pack of papers", 5, 200),
                new Invoice("01222", "Water dispenser", 10, 180),
                new SalariedEmployee("Noah", "Johnson", "1111", 40000),
                new HourlyEmployee("Chidinma", "Afogu", "2222", 2500, 8),
                new CommissionEmployee("Pelumi", "Joaquim", "3333", 500, 0.7),
                new BasePlusCommissionEmployee("Sarah", "Aleshinloye", "4444", 500, 0.7, 100)
        };

        for (Payable currentPayableObject : payableObjects) {
            System.out.println(currentPayableObject);
            if (currentPayableObject instanceof BasePlusCommissionEmployee) {
             double wage = ((BasePlusCommissionEmployee) currentPayableObject).getBaseSalary() + (((BasePlusCommissionEmployee) currentPayableObject).getBaseSalary() * 0.1);
             ((BasePlusCommissionEmployee) currentPayableObject).setBaseSalary(wage);
            }
            System.out.println(currentPayableObject.getPaymentAmount());
        }


    }
}

