package problem.N400.p367;

public class PerfectSquare {

    public boolean isPerfectSquare(int num) {

        if (num == 1) {
            return true;
        }

        int count = num / 2;

        for (int i = 2; i <= count; i++) {
            if (i * i == num) {
                return true;
            }
            if(i*i>num){
                return false;
            }
        }

        return false;
    }
    public boolean isPerfectSquareV2Mid(int num) {

        if (num == 1) {
            return true;
        }

        int left=0;
        int right=num;
        while (left<=right){
            int mid=left+(right-left)/2;
            int midValue = mid * mid;
            if(midValue ==num){
                return true;
            }else if(midValue<num){
                left=mid+1;
            }else {
                right=mid-1;
            }
        }
        return false;
    }
}
