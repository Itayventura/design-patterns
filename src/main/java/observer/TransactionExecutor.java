package observer;

public class TransactionExecutor {
    private final Mediator mediator;

    public TransactionExecutor(Mediator mediator) {
        this.mediator = mediator;
    }

    public void executeTransaction(double amount, int currencyId, long userId, TransactionType transactionType){
        Transaction transaction = new Transaction(amount, currencyId, userId, transactionType);
        System.out.println("\nexecuting transaction:" + transaction);
        mediator.notify(transactionType, transaction.toString());
    }
}
