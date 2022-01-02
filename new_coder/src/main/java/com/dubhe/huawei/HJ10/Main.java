package com.dubhe.huawei.HJ10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String input;

        while ((input=bufferedReader.readLine())!=null){

            input="uqic^g`(s&jnl(m#vt!onwdj(ru+os&wx";
            StringBuilder stringBuilder = new StringBuilder();

            int length = input.length();
            System.out.println(length);

            List<Character> integerList = new ArrayList<>();

            for(int i=0;i<input.length()-1;i++){

                char c = input.charAt(i);
                boolean contains = integerList.contains(c);
                if(!contains){
                    integerList.add(c);
                    stringBuilder.append(c);
                }else {
                    System.out.println(c);
                }
            }

            System.out.println(integerList.size());
            System.out.println(input);
            System.out.println(stringBuilder);

            com.dubhe.huawei.HJ10.demo.Main.demo(input);
        }



    }
}
