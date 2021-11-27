package observer;

public class SMSObserver implements Observer{
    @Override
    public void observe(String message) {
        System.out.println("SMS handler received message: " + message);
    }
}
