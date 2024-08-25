class ICICI implements Bank{
    
    @Override
    public String getBankName(){
        return "ICICI";
    }

    @Override
    public double getInterestRate() {
        return 11.99;
    }
}