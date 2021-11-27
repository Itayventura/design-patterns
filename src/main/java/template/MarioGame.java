package template;

public class MarioGame implements Game{
    @Override
    public void start() {
        System.out.println("STARTING MARIO");
    }

    @Override
    public void end() {
        System.out.println("ending MARIO");
    }

    @Override
    public String name() {
        return "MARIO";
    }
}
