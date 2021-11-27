package observer;

import lombok.Data;

@Data
public class Transaction {

    private final double amount;
    private final int currencyId;
    private final long userId;
    private final TransactionType transactionType;

    public Transaction(double amount, int currencyId, long userId, TransactionType transactionType) {
        this.amount = amount;
        this.currencyId = currencyId;
        this.userId = userId;
        this.transactionType = transactionType;
    }
}
