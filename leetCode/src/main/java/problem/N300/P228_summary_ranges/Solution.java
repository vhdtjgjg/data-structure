package problem.N300.P228_summary_ranges;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public List<String> summaryRanges(int[] nums) {

        List<String> strList = new ArrayList<String>();

        int length = nums.length;

        if(length==0){
            return null;
        }

        String arrow="->";
        StringBuilder stringBuilder = new StringBuilder("\"");
        stringBuilder.append(nums[0]);

        if(length==1){
            strList.add(stringBuilder.append("\"").toString());
            return strList;
        }


        for(int i=0;i<length-1;i++){

            if(nums[i]+1==nums[i+1]){

                if(i+1==length-1){

                    stringBuilder.append(arrow).append(nums[i]+1).append("\"");
                    strList.add(stringBuilder.toString());
                    return strList;
                }else {
                    continue;
                }
            }else {

                if(length!=2){

                    stringBuilder.append(arrow).append(nums[i]);
                }
                stringBuilder.append("\"");

                strList.add(stringBuilder.toString());
                stringBuilder=new StringBuilder("\"");

                if(i+1==length-1){

                    stringBuilder = new StringBuilder();
                    stringBuilder.append("\"").append(nums[i+1]).append("\"");
                    strList.add(stringBuilder.toString());
                    return strList;
                }
                stringBuilder.append(nums[i+1]);

            }

        }

        return strList;
    }

    public List<String> summaryRangesDemo(int[] nums) {


        List<String> strList = new ArrayList<String>();

        int length = nums.length;

        String arrowStr="->";

        int low=0;
        int high=0;
        int cur=0;

        while (cur<length){

            low=cur;
            cur++;

            while (cur<length&&nums[cur]==nums[cur-1]+1){
                cur++;
            }
            high=cur-1;

            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(nums[low]);
            if(low<high ){
                stringBuilder.append(arrowStr).append(nums[high]);
            }
            strList.add(stringBuilder.toString());
        }

        return strList;
    }
    @Test
    public void test(){
        int[] nums={0,3,5,7};
        System.out.println(summaryRangesDemo(nums));
    }
}
