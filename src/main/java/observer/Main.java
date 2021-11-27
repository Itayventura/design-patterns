package observer;

public class Main {
    public static void main(String[] args) {
        TransactionExecutor transactionExecutor = new TransactionExecutor(
                new Mediator());
        transactionExecutor.executeTransaction(1.0, 1, 1,TransactionType.CARD_DEPOSIT);
        transactionExecutor.executeTransaction(2.0, 3, 3,TransactionType.BIT_DEPOSIT);
        transactionExecutor.executeTransaction(3.0, 4, 1,TransactionType.CARD_DEPOSIT);
        transactionExecutor.executeTransaction(4.0, 5, 1,TransactionType.CASH_DEPOSIT);
        transactionExecutor.executeTransaction(5.0, 7, 5,TransactionType.REMITTANCE);

    }
}
