import java.util.logging.Logger;

abstract class Loan {
    Logger LOGGER = Logger.getLogger(Loan.class.getName());
    protected double rate;
    abstract void getInterestRate(double rate);
    public void calculateLoanPayment(double amount, int years) {
        int n;

        n = years*12;
        rate = rate/1200;
        double emi = ((rate*Math.pow((1+rate),n))/((Math.pow((1+rate),n))-1))*amount;  
        emi = Math.round(emi);
        LOGGER.info("Monthly emi is "+emi+" for the loan amount "+amount);
    }
}