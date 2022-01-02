package common;

import java.util.Arrays;

public class ArrayUtils {

    public static void show(int[] ints){
        System.out.print("[");
        Arrays.stream(ints).forEach(i->{
            System.out.print(i+" ");
        });
        System.out.print("]");
    }
}
