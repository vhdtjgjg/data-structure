package problem.N400.p342;

public class Four {

    public boolean isPowerOfFour(int n) {

        if(n==1){
            return true;
        }
        while (n/4!=0) {
            if(n%4!=0){
                return false;
            }
            n/=4;
        }
        return n==1;

    }
}
