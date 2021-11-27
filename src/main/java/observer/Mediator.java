package observer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Mediator {
    private final Map<TransactionType, List<Observer>> subjectObservers;
    private final Observer RedListObserver;
    private final Observer SMSObserver;
    private final Observer EmailObserver;

    public Mediator() {
        this.RedListObserver = new RedListObserver();
        this.SMSObserver = new SMSObserver();
        this.EmailObserver = new EmailObserver();
        this.subjectObservers = new HashMap<TransactionType, List<Observer>>(){{
            put(TransactionType.CARD_DEPOSIT, List.of(RedListObserver, EmailObserver));
            put(TransactionType.CASH_DEPOSIT, List.of(RedListObserver, SMSObserver));
            put(TransactionType.BIT_DEPOSIT, List.of(RedListObserver, EmailObserver, SMSObserver));
            put(TransactionType.REMITTANCE, List.of(SMSObserver));
        }};
    }

    public void notify(TransactionType transactionType, String message){
        System.out.println("\nnotifying " + transactionType.name() + " observers");
        this.subjectObservers.getOrDefault(transactionType, new ArrayList<>())
                .forEach(observer -> observer.observe(message));
    }
}
