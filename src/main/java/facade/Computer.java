package facade;

public class Computer {

    private final OS os;
    private final Memory memory;
    private final Speakers speakers;

    public Computer(OS os, Memory memory, Speakers speakers) {
        this.os = os;
        this.memory = memory;
        this.speakers = speakers;
    }

    public void turnOn(){
        System.out.println("turning on computer");
        os.start();
        speakers.turnON();
        memory.load();
    }

    public void turnOff(){
        System.out.println("turning off computer");
        os.stop();
        speakers.turnOff();
        memory.clean();
    }

    public void restart(){
        turnOff();
        turnOn();
    }
}
