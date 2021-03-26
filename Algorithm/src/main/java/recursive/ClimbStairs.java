package recursive;

public class ClimbStairs {

    public static void main(String[] args) {

        for (int i=1;i<200;i++) {
            long time1 = System.currentTimeMillis();
            long loop = loop(i);
            long time2 = System.currentTimeMillis();
            long recursive = recursive(i);
            long time3 = System.currentTimeMillis();
            System.out.println(loop+":"+(time2-time1));
            System.out.println(recursive+":"+(time3-time2)+":"+(loop==recursive));


        }

    }

    public static int recursive(int n){

        if(n==0){
            throw new RuntimeException("0阶，给爷爬");
        }

        if(n==1||n==2){
            return n;
        }

        return recursive(n-1)+recursive(n-2);

    }

    public static int loop(int n){

        if(n==0){
            throw new RuntimeException("0阶，给爷爬");
        }

        if(n==1||n==2){
            return n;
        }

        int one=2;//一步之遥
        int two=1;//二步之遥
        int sum=0;

        for(int i=3;i<=n;i++){

            sum=one+two;
            two=one;
            one=sum;

        }


        return sum;

    }
}
