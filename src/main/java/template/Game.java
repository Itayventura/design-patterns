package template;

public interface Game {

    void start();
    void end();
    String name();
    default void play(){
        System.out.println("\nPLAYING " + name());
        start();
        end();
    }
}
