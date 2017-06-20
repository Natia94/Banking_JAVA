
public class Acount {
    private Costumer customer;
    private double balance;
    private String accountNUmber;
    private Transaction  transactions[];
    private int transactionsNumber=0;


    public Acount(Costumer costumer) {
        this.customer=costumer;
        transactions = new Transaction[20];
    }


    private void relocate(){
        int newSize=transactions.length*2;
        Transaction transactionsNew[]=new Transaction[newSize];
        for (int i=0;i<transactions.length;i++){
            transactionsNew[i]=transactions[i];
        }
        this.transactions=transactionsNew;

    }
    public String toString(){
        return "";
    }

    public double getBalance() {
        return balance;
    }

    public Costumer getCustomer() {
        return customer;
    }

    public void setCustomer(Costumer customer) {
        this.customer = customer;
    }
    public void  addToBalance(double value){
        this.balance+=value;
        if(transactionsNumber<transactions.length-2){
            relocate();
        }
        transactions[transactionsNumber]=new Transaction();
        transactions[transactionsNumber].setCustomerNumber(this.customer.getCustomerNumber());
        transactions[transactionsNumber].setAmount(value);
        transactions[transactionsNumber].setTransactinType(TransactionType.ADDTOBALANCE.CODE);
        transactionsNumber++;
    }

    public void withdrawFromBalance(double value) {
        if(!(this.balance <value)){
            balance-=value;
            if(transactionsNumber<transactions.length-2){
                relocate();
            }
            transactions[transactionsNumber]=new Transaction();
            transactions[transactionsNumber].setCustomerNumber(this.customer.getCustomerNumber());
            transactions[transactionsNumber].setAmount(value);
            transactions[transactionsNumber].setTransactinType(TransactionType.WITHDRAWFROMBALANCE.CODE);
            transactionsNumber++;
        }
    }
}
