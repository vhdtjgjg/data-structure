package com.dubhe.yvewen2021.sum;

import org.junit.Test;

import java.util.ArrayList;

public class Solution {

    /**
     * 计算一组数字的和
     * @param numbers string字符串ArrayList 一组自然数
     * @return string字符串
     */
    public String sum (ArrayList<String> numbers) {
        // write code here

        String result="0";
        for (String number : numbers) {

            if(number==null||number.length()==0){
                continue;
            }
            int resultLen = result.length();
            int curNumLen = number.length();
            int sum=0;
            int remain;
            StringBuilder stringBuilder = new StringBuilder();
            while (resultLen>0||curNumLen>0){

                int resultNum=0;
                if(resultLen>0){
                    resultNum = result.charAt(--resultLen) - '0';
                }

                int curNum=0;
                if(curNumLen>0){
                    curNum = number.charAt(--curNumLen) - '0';
                }

                sum=sum+resultNum+curNum;
                remain=sum%10;
                stringBuilder.append(remain);
                sum/=10;
            }

            if(sum!=0){
                stringBuilder.append(sum);
            }
            result=stringBuilder.reverse().toString();


        }

        return result;
    }

    @Test
    public void test(){

        String num1="123456";
        String num2="123456789";
        String num3="123456789123";
        ArrayList<String> strings = new ArrayList<>();
        strings.add(num1);
        strings.add(num2);
        strings.add(num3);
        System.out.println(sum(strings));


    }
}
