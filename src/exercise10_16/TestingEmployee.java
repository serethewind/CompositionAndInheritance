package CompostionAndInheritance;

public class TestingEmployee {
    public static void main(String[] args) {

        BasePlusCommissionCompensationModel sarah = new BasePlusCommissionCompensationModel(100, 0.5, 1000);
        CommissionCompensationModel pelumi = new CommissionCompensationModel(100, 0.5);

       Employee sarahDetails = new Employee("Sarah", "Aleshinloye", "123456789", sarah);
       Employee pelumiDetails = new Employee("Pelumi", "Joaquim", "987654321", pelumi);
        System.out.println(sarahDetails.earnings());
        System.out.println(pelumiDetails.earnings());
    }
}
