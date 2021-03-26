package com.dubhe.alphabet;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String str;
        while ((str=bufferedReader.readLine())!=null){
            Character c = str.charAt(0);
            if(c.compareTo('A')>=0&&c.compareTo('Z')<=0||c.compareTo('a')>=0&&c.compareTo('z')<=0){
                System.out.println(c+" is an alphabet.");
            }else {
                System.out.println(c+" is not an alphabet.");
            }
        }
    }
}
