package CompostionAndInheritance;

public class Employee {
    private String firstName;
    private String lastName;
    private String ssn;

    private CompensationModel compensationModelTemplate;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public Employee(String firstName, String lastName, String ssn, CompensationModel compensationModelTemplate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.ssn = ssn;
        this.compensationModelTemplate = compensationModelTemplate;
    }

    public CompensationModel getCompensationModelTemplate() {
        return compensationModelTemplate;
    }

    public void setCompensationModelTemplate(CompensationModel compensationModelTemplate) {
        this.compensationModelTemplate = compensationModelTemplate;
    }

   public double earnings(){
        return compensationModelTemplate.earnings();
   }


}
