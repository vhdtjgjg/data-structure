package problem.N400.p349;

import java.util.Arrays;

public class NumsIntersection {

    public int[] intersection(int[] nums1, int[] nums2) {

        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int index1=0;
        int index2=0;

        int min = Math.min(nums1.length, nums2.length);

        int[] ints = new int[min];

        int resultIndex=0;

        while (index1<nums1.length&&index2<nums2.length){
            if(index1!=0&&nums1[index1]==nums1[index1-1]){
                index1++;
                continue;
            }
            if(index2!=0&&nums2[index2]==nums2[index2-1]){
                index2++;
                continue;
            }
            if(nums1[index1]==nums2[index2]){
                ints[resultIndex++]=nums1[index1];
                index1++;
                index2++;
            }else if(nums1[index1]>nums2[index2]){
                index2++;
            }else {
                index1++;
            }
        }

        return Arrays.copyOfRange(ints,0,resultIndex);
    }
}
