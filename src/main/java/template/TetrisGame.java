package template;

public class TetrisGame implements Game{
    @Override
    public void start() {
        System.out.println("STARTING TETRIS");
    }

    @Override
    public void end() {
        System.out.println("ENDING TETRIS");
    }

    @Override
    public String name() {
        return "TETRIS";
    }
}
