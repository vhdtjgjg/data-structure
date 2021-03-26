package com.dubhe.average;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String[] sArr = bufferedReader.readLine().split(" ");
        int sum= Arrays.stream(sArr).parallel().mapToInt(Integer::parseInt).sum();
        System.out.printf("%.1f",sum*1.0/sArr.length);


    }
}
