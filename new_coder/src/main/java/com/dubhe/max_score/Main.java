package com.dubhe.max_score;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String str;
        while ((str=bufferedReader.readLine())!=null){

            int maxScore =max(str);
            System.out.println(maxScore);
        }
    }

    private static int max(String str) {

        String[] sArr = str.split(" ");
        int max=0;
        for (String s : sArr) {
            int i = Integer.parseInt(s);
            if(max<i){
                max=i;
            }
        }
        return max;
    }
}
