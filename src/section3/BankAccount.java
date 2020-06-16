package section3;

public class BankAccount {
    //vars
    String accountNumber;
    String routingNumber;
    String name;
    String ssn;
    String accountType;

    // Constructors - unique methods


    public BankAccount(String accountNumber, String routingNumber, String name, String ssn, String accountType) {
        this.accountNumber = accountNumber;
        this.routingNumber = routingNumber;
        this.name = name;
        this.ssn = ssn;
        this.accountType = accountType;
    }

    public BankAccount() {
        this.accountNumber = "default";
        this.routingNumber = "default";
        this.name = "default";
        this.ssn = "default";
        this.accountType = "default";
    }

    void deposit()
    {

    }

    void withdraw()
    {

    }

    void getStatus()
    {

    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "accountNumber='" + accountNumber + '\'' +
                ", routingNumber='" + routingNumber + '\'' +
                ", name='" + name + '\'' +
                ", ssn='" + ssn + '\'' +
                ", accountType='" + accountType + '\'' +
                '}';
    }
}
