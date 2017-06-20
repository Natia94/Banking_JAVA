import java.util.UUID;


public class Bank {
    private Acount acounts[] = new Acount[100];
    private int acountsNumber = 0;

    public Bank() {

    }
    public Acount getAcount(int index){
        return acounts[index];
    }

    public void makeDeposit(int acount,double value){
        acounts[acount].addToBalance(value);
    }
    public void makeWithdrawl(int acount,double value){
        acounts[acount].withdrawFromBalance(value);
    }

    public void addAacount(int type) {
        if(acountsNumber>acounts.length-2){
            relocate();
        }
        if (type==1)
            acounts[acountsNumber]=new Acount(new Student(UUID.randomUUID().toString()));
        if (type==2)
            acounts[acountsNumber]=new Acount(new Adult(UUID.randomUUID().toString()));
        if (type==3)
            acounts[acountsNumber]=new Acount(new Senior(UUID.randomUUID().toString()));
        acountsNumber++;
    }

    private void relocate() {
        int newSize = acounts.length * 2;
        Acount acountsNew[] = new Acount[newSize];
        for (int i = 0; i < acounts.length; i++) {
            acountsNew[i] = acounts[i];
        }
        this.acounts = acountsNew;

    }
}
