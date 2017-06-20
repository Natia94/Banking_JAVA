import java.util.Date;

public class Transaction {
    private String customerNumber;
    private int transactinType;
    private double amount;
    private Date date;
    private double fees;

    public Transaction(){
        date=new Date();
    }

    public void processTransaction(){

    }


    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public double getFees() {
        return fees;
    }

    public void setFees(double fees) {
        this.fees = fees;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public int getTransactinType() {
        return transactinType;
    }

    public void setTransactinType(int transactinType) {
        this.transactinType = transactinType;
    }

    public String getCustomerNumber() {
        return customerNumber;
    }

    public void setCustomerNumber(String customerNumber) {
        this.customerNumber = customerNumber;
    }
}
