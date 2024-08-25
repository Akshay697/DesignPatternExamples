class HomeLoan extends Loan {

    @Override
    void getInterestRate(double rate) {
        super.rate = rate;
    }
    
}