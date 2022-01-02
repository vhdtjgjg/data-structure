package com.dubhe.huawei.HJ4;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String input;

        while ((input=bufferedReader.readLine())!=null){


            for(int i=0;;i++){

                if(i%8==0&&i!=0){
                    if(i>input.length()){
                        break;
                    }
                    System.out.println();
                }

                if(i<input.length()){
                    System.out.print(input.charAt(i));
                }else {
                    System.out.print("0");
                }

            }
            System.out.println();
        }
    }


}
