package problem.N300.P263;

public class UglyNum {

    public boolean isUgly(int n) {

        if(n==0){
            return false;
        }
        if(n==1){
            return true;
        }
        n=aliquot(n);
        return isUgly(n);
    }

    private int aliquot(int n) {
        if(n%2==0){
            return n/2;
        }
        if(n%3==0){
            return n/3;
        }
        if(n%5==0){
            return n/5;
        }
        return 0;
    }

}
