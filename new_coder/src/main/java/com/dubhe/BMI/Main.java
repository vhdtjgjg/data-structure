package com.dubhe.BMI;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String[] sArr = bufferedReader.readLine().split(" ");

        double weight = Double.parseDouble(sArr[0]);
        double height = Double.parseDouble(sArr[1]);

        double bmi = weight / Math.pow(height, 2);
        if(bmi>=18.5&&bmi<=23.9){
            System.out.println("Normal");
        }else {
            System.out.println("Abnormal");
        }


    }
}
