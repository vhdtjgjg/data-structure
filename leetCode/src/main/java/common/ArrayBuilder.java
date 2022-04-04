package common;

public class ArrayBuilder {

    public static int[] ofInt(int...nums){
        return nums;
    }

    public static <T> T[] of(T...nums){
        return nums;
    }


}
