package com.dubhe.huawei.HJ13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String input;

        StringBuilder stringBuilder = new StringBuilder();

        while ((input=bufferedReader.readLine())!=null){

            String[] s = input.split(" ");

            for(int i=s.length-1;i>=0;i--){
                stringBuilder.append(s[i]).append(" ");
            }

            System.out.println(stringBuilder);

        }

    }
}
