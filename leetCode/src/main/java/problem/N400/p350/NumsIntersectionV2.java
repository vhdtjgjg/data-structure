package problem.N400.p350;

import java.util.Arrays;

public class NumsIntersectionV2 {

    public int[] intersect(int[] nums1, int[] nums2) {

        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int index1=0;
        int index2=0;

        int min = Math.min(nums1.length, nums2.length);

        int[] ints = new int[min];

        int resultIndex=0;

        while (index1<nums1.length&&index2<nums2.length){
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
