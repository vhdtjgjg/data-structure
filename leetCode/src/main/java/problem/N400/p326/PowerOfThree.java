package problem.N400.p326;

import java.util.HashSet;
import java.util.Set;

public class PowerOfThree {

    public static boolean isPowerOfThree(int n) {

        if(n==1){
            return true;
        }

        if(n<3||n%3!=0){
            return false;
        }

        n=n/3;

        return isPowerOfThree(n);
    }

    private static final Set<Integer> SET=new HashSet<>(20);

    static {
        int n=1;
        while (n<=Integer.MAX_VALUE/3){
            SET.add(n);
            n=n*3;
        }
        SET.add(n);
    }

    public static boolean isPowerOfThreeV2(int n) {

        return n>0&&SET.contains(n);
    }
}
