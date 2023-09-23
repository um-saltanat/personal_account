package personal_acc;

public class MainClass {
    public static void main(String[] args) {

        PersonalAccount person1 = new PersonalAccount(12234, "Alex");
        person1.deposit(20000);
        person1.withdraw(5000);

        System.out.println(person1.getBalance());
        person1.printTransactionHistory();
    }
}
