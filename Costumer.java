
public abstract class Costumer {
    private String name;
    private String address;
    private int age;
    private String telephoneNumber;
    private String customerNumber;

    public Costumer(String name, String address, int age, String telephoneNumber, String customerNumber) {
        this.name = name;
        this.address = address;
        this.age = age;
        this.telephoneNumber = telephoneNumber;
        this.customerNumber = customerNumber;
    }
    public Costumer(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    public void setTelephoneNumber(String telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

    public String getCustomerNumber() {
        return customerNumber;
    }

    public void setCustomerNumber(String customerNumber) {
        this.customerNumber = customerNumber;
    }
    public abstract double getCheckingInterest();

    public abstract double getCheckCharge();

    public abstract double getSavingsInterest();
}
