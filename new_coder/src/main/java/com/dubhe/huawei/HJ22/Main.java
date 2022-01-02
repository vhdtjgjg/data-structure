package com.dubhe.huawei.HJ22;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));


        for(int i=0;i<10;i++){
            int total = 0;
            String in = bufferedReader.readLine();
            int canCount = Integer.parseInt(in);
            if(canCount==0){
                break;
            }
            //total+=canCount;
            while (canCount>=3){

                total+=canCount/3;
                canCount=canCount/3+canCount%3;


            }
            if(canCount==2){
                total++;
            }
            System.out.println(total);
        }

    }
}
