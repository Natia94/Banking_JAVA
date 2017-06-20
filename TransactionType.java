
public enum TransactionType {
    ADDTOBALANCE(0),
    WITHDRAWFROMBALANCE(1);


    int CODE;

    TransactionType(int code){
        this.CODE=code;
    }
    public int getCODE() {
        return CODE;
    }
}
