package exec;

import java.util.*;

public class Continuous {

    public List<List<Integer>> getList(int n){

        List<List<Integer>> result=new ArrayList<>();

        int i = n / 2 + 1;

        Queue<Integer> temp = new LinkedList<>();

        int sum=0;
        for (int j = 1; j <= i+1; j++) {
            sum+=j;
            temp.add(j);

            while (sum>n){
                Integer poll = temp.poll();
                sum-=poll;
            }
            if(sum==n){
                List<Integer> list = new ArrayList<>(temp);
                result.add(list);
                Integer poll = temp.poll();
                sum-=poll;
            }
        }
        return result;
    }

    public int[][] findContinuousSequence(int target) {

        List<int[]> result=new ArrayList<>();

        int i = target / 2 + 1;

        Queue<Integer> temp = new LinkedList<>();

        int sum=0;
        for (int j = 1; j <= i+1; j++) {
            sum+=j;
            temp.add(j);

            while (sum>target){
                Integer poll = temp.poll();
                sum-=poll;
            }
            if(sum==target){
                List<Integer> list = new ArrayList<>(temp);
                int[] ints = new int[list.size()];
                for (int i1 = 0; i1 < list.size(); i1++) {
                    ints[i1]=list.get(i1);
                }
                result.add(ints);
                Integer poll = temp.poll();
                sum-=poll;
            }
        }
        return result.toArray(new int[result.size()][]);
    }
}
