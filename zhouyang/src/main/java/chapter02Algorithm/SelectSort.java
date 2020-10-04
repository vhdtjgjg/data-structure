package chapter02Algorithm;

import java.util.Arrays;

public class SelectSort {

    public static void main(String[] args) {
        int[] ints = new int[]{3,4,2,7,0,1,3,2,8,32,12,3,2};
        selectSort(ints);
    }

    public static void selectSort(int[] arr){
        int n=arr.length;
        for(int i=0;i<n;i++){
            int min=i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[min]){
                    min=j;
                }
            }
            if(min!=i){
                int temp=arr[min];
                arr[min]=arr[i];
                arr[i]=temp;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
