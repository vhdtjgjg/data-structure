package com.dubhe.huawei.HJ1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String input;

        while ((input=bufferedReader.readLine())!=null){

            String[] s = input.split(" ");
            System.out.println(s[s.length-1].length());

        }

    }
}
