import java.util.logging.*;
import java.util.Scanner;
public class AbstractFactoryPattern {
    
    private static Logger LOGGER = Logger.getLogger(AbstractFactoryPattern.class.getName());
    public static void main(String args[]) {
        LOGGER.info("Enter the bank name to check the loan amount emi");
        LOGGER.info("Available options: \n1. HDFC \n2.ICICI \n3. SBI");
        Scanner scan = new Scanner(System.in);
        String bankName = scan.nextLine();
        LOGGER.info("Enter the type of loan you required from bank "+bankName);
        LOGGER.info("Types of loan available: \n1. HOME \n2. EDUCATION \n3. BUSSINESS");
        String loanType = scan.nextLine();

        LOGGER.info("Enter the loan amount: ");
        double amount = scan.nextDouble();
        LOGGER.info("Enter the tenure");
        int years = scan.nextInt();
        scan.close();
        LOGGER.info("Calculating emi from the "+bankName+" for "+loanType+" of amount "+String.valueOf(amount)+" for the tenure of "+String.valueOf(years)+" yrs");

        AbstractFactory bankFactory = FactoryCreator.geAbstractFactory("bank");
        AbstractFactory loanFactory = FactoryCreator.geAbstractFactory("loan");

        
        Bank bank = bankFactory.getBank(Banks.valueOf(bankName));
        Loan loan = loanFactory.getLoan(Loans.valueOf(loanType));
        loan.getInterestRate(bank.getInterestRate());
        loan.calculateLoanPayment(amount, years);
        
        
    }
}
