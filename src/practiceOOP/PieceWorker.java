package practiceOOP;

public class PieceWorker extends Employee{

    private double wage;
    private double pieces;
    public PieceWorker(String firstName, String lastName, String socialSecurityNumber, double wage, double pieces) {
        super(firstName, lastName, socialSecurityNumber);
        this.pieces = pieces;
        this.wage = wage;
    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }

    public double getPieces() {
        return pieces;
    }

    public void setPieces(double pieces) {
        this.pieces = pieces;
    }

    @Override
    public double getPaymentAmount() {
        return getPieces() * getWage();
    }
}
