import java.util.Date;

public class Loan {
    private double annualInterestRate;
    private int numberOfYears;
    private double loanAmount;
    private Date loanDate;

    /* Default constructor */
    public Loan() {
        this(2.5, 1, 1000);
    }

    /* Constructor with arguments */
    public Loan(double annualInterestRate, int numberOfYears, double loanAmount) {
        this.annualInterestRate = annualInterestRate;
        this.numberOfYears = numberOfYears;
        this.loanAmount = loanAmount;
        loanDate = new java.util.Date();
    }

    /* Return annual interest rate */
    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    /* Set a new annual interest rate */
    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    // Return number of years
    public int getNumberOfYears() {
        return numberOfYears;
    }

    // Set a new number of years
    public void setNumberOfYears(int numberOfYears) {
        this.numberOfYears = numberOfYears;
    }

    // Return loan amount
    public double getLoanAmount() {
        return loanAmount;
    }

    // Set a new loan amount
    public void setLoanAmount(double loanAmount) {
        this.loanAmount = loanAmount;
    }

    // Find monthly payment
    public double getMonthlyPayment() {
        double monthlyInterestRate = annualInterestRate / (12 * 100);
        double f = 1 - Math.pow(1 + monthlyInterestRate, -numberOfYears * 12);
        double monthlyPayment = loanAmount * monthlyInterestRate / f;
        return monthlyPayment;
    }

    /* Find Total amount */
    public double getTotalPayment() {
        double totalPayment = getMonthlyPayment() * numberOfYears * 12;
        return totalPayment;
    }

    /* Return loan date */
    public Date getLoanDate() {
        return loanDate;
    }
}