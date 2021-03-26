package dynamic;

import java.util.List;

public class TriangleTrace {

    public int miniTriangleTotal(List<List<Integer>> triangle){

        int size = triangle.size();

        int[][] dp = new int[size][size];

        List<Integer> lastRow = triangle.get(size - 1);

        for(int i=0;i<lastRow.size();i++){
            dp[size-1][i]=lastRow.get(i);
        }

        for(int i=size-2;i>=0;i--){
            List<Integer> remainTriangle = triangle.get(i);

            for (int j=0;j<remainTriangle.size();j++){
                dp[i][j]=Math.min(dp[i+1][j],dp[i+1][j+1])+remainTriangle.get(j);
            }
        }

        return dp[0][0];
    }
}
