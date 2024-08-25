public class LoanFactory extends AbstractFactory {

    @Override
    public Bank getBank(Banks bank) {
        return null;
    }

    @Override
    public Loan getLoan(Loans loan) {
        if (loan.equals(Loans.HOME)){
            return new HomeLoan();
        } else if (loan.equals(Loans.BUSSINESS)) {
            return new BussinessLoan();
        } else if (loan.equals(Loans.EDUCATION)) {
            return new EducationLoan();
        }
        return null;
    }
    
}
