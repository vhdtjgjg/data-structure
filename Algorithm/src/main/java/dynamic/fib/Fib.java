package dynamic.fib;

import org.junit.Test;

import java.util.ArrayList;

public class Fib {

    public int fib1(int N){

        if(N==1||N==2){
            return 1;
        }

        return fib1(N-1)+fib1(N-2);
    }

    public int fib2(int N){

        if(N<0){
            return 0;
        }

        int[] nums=new int[N+1];

        return helper(nums,N);
    }

    public int fib3(int N){

        if(N<0){
            return 0;
        }

        int[] nums=new int[N+1];

        nums[1]=nums[2]=1;

        for(int i=3;i<=N;i++){
            nums[i]=nums[i-1]+nums[i-2];
        }

        return nums[N];
    }

    public int fib4(int N){

        if(N<0){
            return 0;
        }


        int cur=1;
        int pre=1;
        int sum=1;


        for(int i=3;i<=N;i++){
            sum=cur+pre;
            pre=cur;
            cur=sum;

        }

        return sum;
    }

    private int helper(int[] nums, int n) {

        if(n==1||n==2){
            return 1;
        }

        if(nums[n]!=0){
            return nums[n];
        }

        nums[n]=helper(nums,n-1)+helper(nums,n-2);

        return nums[n];
    }

    @Test
    public void test(){

        int i = fib1(20);
        int j = fib2(20);
        int k = fib2(20);
        int l = fib2(20);
        System.out.println(i);
        System.out.println(j);
        System.out.println(k);
        System.out.println(l);
    }


}
