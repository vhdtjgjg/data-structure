package problem.N500.p401;

import java.util.ArrayList;
import java.util.List;

public class BinaryWatch {

    public List<String> readBinaryWatch(int turnedOn) {
        List<String> result = new ArrayList<>();
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 60; j++) {
                if(Integer.bitCount(i)+Integer.bitCount(j)==turnedOn){
                    result.add(i+":"+(j<10?"0"+j:j));
                }
            }
        }
        return result;
    }
}
