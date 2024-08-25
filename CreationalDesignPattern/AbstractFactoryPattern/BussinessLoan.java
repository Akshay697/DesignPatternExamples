class BussinessLoan extends Loan {

    @Override
    public void getInterestRate(double rate) {
        super.rate = rate;
    }
}