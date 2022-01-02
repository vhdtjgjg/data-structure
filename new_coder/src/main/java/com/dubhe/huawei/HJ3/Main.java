package com.dubhe.huawei.HJ3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String input;

        while ((input=bufferedReader.readLine())!=null){

            Integer num = Integer.valueOf(input);
            Set<Integer> integerSet = new HashSet<>();
            for(int i=0;i<num;i++){
                String randomStr = bufferedReader.readLine();
                Integer randomInt = Integer.valueOf(randomStr);
                integerSet.add(randomInt);
            }

            ArrayList<Integer> integers = new ArrayList<>(integerSet);
            Collections.sort(integers, (o1, o2) -> {
                if(o1>o2){
                    return -1;
                }
                if(o1<o2){
                    return 1;
                }

                return 0;
            });

            for (Integer integer : integers) {
                System.out.println(integer);
            }


        }
    }
}
