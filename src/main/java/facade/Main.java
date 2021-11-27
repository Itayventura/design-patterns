package facade;

public class Main {

    public static void main(String[] args) {
        Computer computer = new Computer(
                new OS(),
                new Memory(),
                new Speakers()
        );
        computer.restart();
    }
}
