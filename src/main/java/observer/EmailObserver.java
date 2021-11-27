package observer;

public class EmailObserver implements Observer{
    @Override
    public void observe(String message) {
        System.out.println("email handler received message: " + message);
    }
}
