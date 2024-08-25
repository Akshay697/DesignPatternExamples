class HDFC implements Bank {
    
    @Override
    public String getBankName(){
        return "HDFC";
    }

    @Override
    public double getInterestRate() {
        return 10.99;
    }
}