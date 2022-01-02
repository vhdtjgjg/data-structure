package com.dubhe.huawei.HJ11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String input;

        while ((input=bufferedReader.readLine())!=null){

            System.out.println(new StringBuilder(input).reverse());

        }
    }
}
