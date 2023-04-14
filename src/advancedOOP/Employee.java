package advancedOOP;

public class Employee {
    private String firsName;
    private String lastName;
    private String bvn;
    private Gender gender;
    private Date birthDate;
    private Date hireDate;
    private Date weddingDate;

    public Employee(String firsName, String lastName, String bvn, Gender gender, Date birthDate, Date hireDate, Date weddingDate) {
        validateBVN(bvn);
        this.firsName = firsName;
        this.lastName = lastName;
        this.bvn = bvn;
        this.gender = gender;
        this.birthDate = birthDate;
        this.hireDate = hireDate;
        this.weddingDate = weddingDate;
    }

    public String getFirsName() {
        return firsName;
    }

    public void setFirsName(String firsName) {
        this.firsName = firsName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getBvn() {
        return bvn;
    }

    public void setBvn(String bvn) {
        this.bvn = bvn;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public Date getHireDate() {
        return hireDate;
    }

    public void setHireDate(Date hireDate) {
        this.hireDate = hireDate;
    }

    public Date getWeddingDate() {
        return weddingDate;
    }

    public void setWeddingDate(Date weddingDate) {
        this.weddingDate = weddingDate;
    }

    private boolean validateBVN(String bvn) {
        System.out.println(ErrorMessages.bvnLengthError);
        return bvn.length() == 11;
    }


    public void displayMethod() {
        System.out.printf(" First Name: %s,\n Last Name: %s,\n BVN: %s,\n Gender: %s,\n Birth date:%s,\n Wedding date: %s,\n Hire date: %s", getFirsName(), getLastName(), getBvn(), getGender(), getBirthDate().toString(), getWeddingDate().toString(), getHireDate().toString());
    }
}
