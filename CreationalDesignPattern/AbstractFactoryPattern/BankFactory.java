class BankFactory extends AbstractFactory {

	@Override
	public Bank getBank(Banks bank){
		System.out.println("Bank passed: "+bank.name());
		if(bank.equals(Banks.HDFC)) {
			return new HDFC();
		} else if (bank.equals(Banks.ICICI)) { 
			return new ICICI();
		} else if(bank.equals(Banks.SBI)){ 
			return new SBI();
		}
		return null;
	}

	@Override
	public Loan getLoan(Loans loan) {
		return null;
	}
}
