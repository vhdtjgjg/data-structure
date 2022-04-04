package problem.N2100.p2028;

import java.util.Arrays;

public class MissingRolls {

    public int[] missingRolls(int[] rolls, int mean, int n) {

        int resultTotal = mean * (rolls.length + n) - Arrays.stream(rolls).sum();
        if(n>resultTotal||n*6<resultTotal){
            return new int[]{};
        }
        int i = resultTotal / n;
        int[] result = new int[n];
        Arrays.fill(result,i);
        int remain=resultTotal-i*n;
        int j=0;
        while (j<n){
            if(remain==0){
                return result;
            }
            if(result[j]==6){
                j++;
            }
            result[j]=result[j]+1;
            remain--;
        }
        return result;
    }
}
