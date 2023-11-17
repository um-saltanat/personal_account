package personal_acc;

import java.util.ArrayList;

/**
 * Represents a personal account.
 *
 * @author Saltanat Umarova
 * @version 1.0
 * @since 2023-09-23
 */

public class PersonalAccount {

    private int accountNumber;
    private String accountHolder;
    private double balance;
    ArrayList<Amount> transactions = new ArrayList<>();

    /**
     * Creates a personal account with the specified name and
     * number of their account.
     * @param accountNumber represents account number.
     * @param accountHolder represents account holder.
     */
    public PersonalAccount(int accountNumber, String accountHolder) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = 0.0;
    }

    /**
     * Adds amount to the balance.
     * Adds amount and transaction type to transactions.
     * @param amount represents amount of money.
     */
    public void deposit(double amount) {
        this.balance += amount;
        Amount transaction = new Amount(amount, "Deposit");
        this.transactions.add(transaction);
    }

    /**
     * Withdraws amount from the balance.
     * Adds amount and transaction type to the transactions.
     * @param amount represents amount of money.
     */
    public void withdraw(double amount) throws InsufficientBalanceException {
        if (amount > this.balance) {
            throw new InsufficientBalanceException("The amount cannot be withdraw - Insufficient funds on balance ");
        } else {
            this.balance -= amount;
            Amount transaction = new Amount(amount, "Withdraw");
            this.transactions.add(transaction);
        }
    }

    /**
     * Prints out the transaction history.
     */
    public void printTransactionHistory() {
        System.out.println(transactions);
    }

    /**
     * Gets the account's number.
     * @return An integer representing account's number.
     */
    public int getAccountNumber() {
        return accountNumber;
    }

    /**
     * Gets the account holder's name.
     * @return A String representing account holder's name.
     */
    public String getAccountHolder() {
        return accountHolder;
    }

    /**
     * Gets the account's balance.
     * @return A double representing account's balance.
     */
    public double getBalance() {
        return balance;
    }


}
