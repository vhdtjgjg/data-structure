package com.dubhe.huawei.HJ9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String input;

        while ((input=bufferedReader.readLine())!=null){

            List<Integer> integerList = new ArrayList<>();
            String[] split = input.split("");
            for (int i=split.length-1;i>=0;i--) {

                int j = Integer.parseInt(split[i]);
                boolean contains = integerList.contains(j);
                if(!contains){
                    integerList.add(j);
                }


            }

            StringBuilder stringBuilder = new StringBuilder();
            for (Integer integer : integerList) {
                stringBuilder.append(integer);
            }

            System.out.println(stringBuilder);


        }


    }
}
