package template;

public class Main {
    public static void main(String[] args) {
        Game mario = new MarioGame();
        Game Tetris = new TetrisGame();
        mario.play();
        Tetris.play();
    }
}
