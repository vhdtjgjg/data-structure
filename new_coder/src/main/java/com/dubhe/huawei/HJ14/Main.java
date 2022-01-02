package com.dubhe.huawei.HJ14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String input;

        while ((input=bufferedReader.readLine())!=null){


            int i = Integer.parseInt(input);
            List<String> stringList = new ArrayList<>();
            for(int j=0;j<i;j++){
                 stringList.add(bufferedReader.readLine());
            }

            Collections.sort(stringList);

            for (String s : stringList) {
                System.out.println(s);
            }
        }
    }
}
