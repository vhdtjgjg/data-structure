package problem.N400.p338;

public class BitCount {

    public int[] countBits(int n) {

        int[] ints = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            int count=getBitCount(i);
            ints[i]=count;
        }

        return ints;
    }

    private int getBitCount(int i) {
        int result=0;
        while (i/2!=0){
            if (i%2==1) {
                result++;
            }
            i/=2;
        }
        if(i==1){
            result++;
        }
        return result;
    }
}
