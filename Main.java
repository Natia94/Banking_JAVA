public class Main {

    public static void main(String[] args) {
        Bank bank=new Bank();
        for (int i=0;i<50;i++){
            bank.addAacount(1);
        }
        for (int i=0;i<50;i++){
            bank.addAacount(2);
        }
        for (int i=0;i<50;i++){
            bank.addAacount(3);
        }

        bank.makeDeposit(40,50);
        bank.makeDeposit(35,30);
        bank.makeWithdrawl(40,10);
    }
}
