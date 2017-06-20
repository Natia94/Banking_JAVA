
public class Senior extends Costumer {
    private  final double SAVINGS_INTEREST  = 5;
    private  final double CHECKING_INTEREST  = 6;
    private  final double CHECK_CHARGE  = 7;
    private  final double OVERDRAFT_PENALTY  = 8;

    public Senior(String s){
        this.setCustomerNumber(s);
    }







    @Override
    public double getCheckingInterest() {
        return this.CHECKING_INTEREST;
    }

    @Override
    public double getCheckCharge() {
        return this.CHECK_CHARGE;
    }

    @Override
    public double getSavingsInterest() {
        return this.SAVINGS_INTEREST;
    }
}
