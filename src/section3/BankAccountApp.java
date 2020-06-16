package section3;

public class BankAccountApp {

    public static void main(String[] args) {

        //Create new account >> think initatie an object

        BankAccount acc1 = new BankAccount();
        BankAccount acc2 = new BankAccount("1", "2", "3", "4", "5");

        System.out.println(acc1.toString());
        System.out.println(acc2.toString());
    }
}
