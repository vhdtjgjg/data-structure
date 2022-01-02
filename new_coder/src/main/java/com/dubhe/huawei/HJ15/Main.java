package com.dubhe.huawei.HJ15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String input;

        while ((input=bufferedReader.readLine())!=null){

            int i = Integer.parseInt(input);

            int count=0;

            while (i!=0){
                if(i%2==1){
                    count++;
                }
                i/=2;
            }

            System.out.println(count);

        }

    }
}
