package com.dubhe.huawei.HJ6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String s = bufferedReader.readLine();

        long l = Long.parseLong(s);
        StringBuilder stringBuilder = new StringBuilder();
        while (l!=1){

            if(l<=3){
                stringBuilder.append(l).append(" ");
                break;
            }

            for(int i=2;i<=l;i++){

                //System.out.println("i:"+i+",l:"+l);
                if(i>Math.sqrt(l)){
                    i=(int) l;
                }
                if(l%i==0){
                    stringBuilder.append(i).append(" ");
                    l/=i;
                    break;
                }

            }

        }
        System.out.print(stringBuilder);








    }
}
