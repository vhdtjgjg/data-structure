package com.dubhe.hexadecimal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String[] s = bufferedReader.readLine().split(" ");


        BigInteger bigInteger = new BigInteger(s[0].substring(2), 16);
        BigInteger bigInteger1 = new BigInteger(s[1].substring(1), 8);
        System.out.println(bigInteger1.add(bigInteger));
    }
}
