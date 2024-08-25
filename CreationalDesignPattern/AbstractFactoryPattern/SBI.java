class SBI implements Bank{
    
    @Override
    public String getBankName(){
        return "SBI";
    }

    @Override
    public double getInterestRate() {
        return 12.25;
    }
}