package problem.N500.p412;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {

    private static final String TF = "FizzBuzz";
    private static final String T = "Fizz";
    private static final String F = "Buzz";

    public List<String> fizzBuzz(int n) {

        List<String> results = new ArrayList<>(n);
        for (int i = 1; i <= n; i++) {
            if(i%15==0){
                results.add(TF);
                continue;
            }
            if(i%3==0){
                results.add(T);
                continue;
            }
            if(i%5==0){
                results.add(F);
                continue;
            }
            results.add(i+"");
        }
        return results;
    }
}
