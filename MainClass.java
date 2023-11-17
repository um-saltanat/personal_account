package personal_acc;

public class MainClass {
    public static void main(String[] args) throws InsufficientBalanceException {

        PersonalAccount person1 = new PersonalAccount(12234, "Alex");
        person1.deposit(1000);
        person1.withdraw(5000); // throws an exception

        System.out.println(person1.getBalance());
        person1.printTransactionHistory();
    }
}
