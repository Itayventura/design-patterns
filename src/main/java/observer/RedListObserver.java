package observer;

public class RedListObserver implements Observer{
    @Override
    public void observe(String message) {
        System.out.println("red list handler received message: " + message);
    }
}
