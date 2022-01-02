package com.dubhe.huawei.HJ2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {


    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String str = bufferedReader.readLine();
        String s = bufferedReader.readLine();
        char cLow = s.toLowerCase().charAt(0);
        char cUp = s.toUpperCase().charAt(0);
        int count=0;
        for(int i=0;i<str.length();i++){

            char c = str.charAt(i);

            if(cLow==c||cUp==c){
                count++;
            }
        }
        System.out.println(count);
    }
}
