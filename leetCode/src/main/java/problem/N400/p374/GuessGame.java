package problem.N400.p374;

public class GuessGame {

    private int pick;


    public GuessGame(int pick){
        this.pick=pick;
    }

    protected int guess(int num){
        return Integer.compare(pick, num);
    }


    public int getPick() {
        return pick;
    }
}
