package chapter1.part3;

import edu.princeton.cs.algs4.Bag;
import edu.princeton.cs.algs4.StdIn;

public class Stats {

    public static void main(String[] args) {
        Bag<Double> nums = new Bag<Double>();

        while (!StdIn.isEmpty())
            nums.add(StdIn.readDouble());

        int N = nums.size();

        double sum=0.0;

        for(double x:nums){
            sum+=x;
        }

        double mean = sum / N;

        sum=0.0;

        for(double x:nums){
            sum+=(x-mean)*(x-mean);
        }

        double sqrt = Math.sqrt(sum / (N - 1));

        System.out.printf("Mean: %.2f\n",mean);
        System.out.printf("dev: %.2f\n",sqrt);

    }
}
