package problem.N400.p374;

public class GuessNum extends GuessGame{

    public GuessNum(int pick) {
        super(pick);
    }

    public int guessNumber(int n) {
        int left=1;
        int right=n;
        while (left<=right){
            int mid=left+(right-left)/2;
            if (guess(mid)==0) {
                return mid;
            }
            if(guess(mid)<0){
                right=mid-1;
            }else {
                left=mid+1;
            }
        }
        return 0;
    }
}
