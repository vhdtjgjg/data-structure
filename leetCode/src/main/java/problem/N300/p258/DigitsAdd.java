package problem.N300.p258;

import org.junit.Assert;
import org.junit.Test;

public class DigitsAdd {

    public int addDigits(int num) {
        if(num/10==0){
            return num;
        }
        num=addDigit(num);
        return addDigits(num);
    }

    private int addDigit(int num) {
        int result=0;

        while (num!=0){
            result+=num%10;
            num=num/10;

        }
        return result;
    }

    @Test
    public void addDigits() {
        DigitsAdd digitsAdd = new DigitsAdd();

        Assert.assertEquals(2,digitsAdd.addDigits(38));
        Assert.assertEquals(1,digitsAdd.addDigits(100));

    }
}
