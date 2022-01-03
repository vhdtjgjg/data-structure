package problem.N500.p400;

public class NthDigit {

    public int findNthDigit(int n) {

        long i=9;
        int j=1;
        long start=1;
        while (n>i*j){
            n-=i*j;
            j++;
            i*=10;
            start*=10;
        }
        int index = (n-1) / j;
        int bit = (n-1) % j;

        char c = String.valueOf(start + index).charAt(bit);
        return c-48;
    }

    public static void main(String[] args) {
        int i='0'-48;
        System.out.println(i);
    }
}
