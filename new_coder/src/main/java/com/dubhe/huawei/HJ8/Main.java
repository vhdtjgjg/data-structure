package com.dubhe.huawei.HJ8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String input;


        while ((input=bufferedReader.readLine())!=null){

            int size = Integer.parseInt(input);
            Map<Integer, Integer> map = new HashMap<>(size);
            System.out.println("size:"+size);
            for (int i=0;i<size;i++ ){
                String[] s = bufferedReader.readLine().split(" ");

                int key = Integer.parseInt(s[0]);
                int value = Integer.parseInt(s[1]);

                System.out.println(key+"->"+value);

                Integer integer = map.get(key);

                if(integer==null){
                    integer=0;
                }

                map.put(key,value+integer);

            }


            Set<Integer> keySet = map.keySet();
            List<Integer> ketList = new ArrayList<>(keySet);
            Collections.sort(ketList);
            for (Integer integer : ketList) {
                System.out.println(integer+" "+map.get(integer));
            }
        }
    }
}
