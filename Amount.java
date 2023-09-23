package personal_acc;

/**
 * Represents a transaction.
 * @author Saltanat Umarova
 * @version 1.0
 * @since 2023-09-23
 */
public class Amount {

    private double amount;
    String transactionType; // "Deposit", "Withdraw"

    /**
     * Creates a transaction with specified amount and transaction type.
     * @param amount
     * @param transactionType
     */
    public Amount(double amount, String transactionType) {
        this.amount = amount;
        this.transactionType = transactionType;
    }

    /**
     * Returns a string representation of the object.
     * @return A String containing transaction and its properties.
     */
    @Override
    public String toString() {
        return "Transaction{" +
                "amount=" + amount +
                ", transactionType='" + transactionType + '\'' +
                '}';
    }
}
