package com.dubhe.huawei;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HJ5 {

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String input;

        while ((input=bufferedReader.readLine())!=null){

            int i = Integer.parseInt(input.substring(2), 16);
            System.out.println(i);

        }

    }
}
