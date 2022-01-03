package common;

import java.util.Arrays;
import java.util.List;

public class ListUtils {

    public static <T> List<T> of(T...nums){
        List<T> ts = Arrays.asList(nums);
        return ts;
    }
}
