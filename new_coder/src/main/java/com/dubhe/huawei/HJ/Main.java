package com.dubhe.huawei.HJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String input;

        while ((input=bufferedReader.readLine())!=null){

            String[] split = input.split("\\.");
            BigDecimal bigDecimalFloat = new BigDecimal("0."+split[1]);
            BigDecimal bigDecimal1 = new BigDecimal("0.5");
            int i = bigDecimalFloat.compareTo(bigDecimal1);
            if(i>=0){
                System.out.println(Integer.parseInt(split[0])+1);
            }else {
                System.out.println(Integer.parseInt(split[0]));
            }



        }
    }
}
