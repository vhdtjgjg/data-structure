package com.dubhe.square;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String str;
        while ((str=bufferedReader.readLine())!=null){

            int i = Integer.parseInt(str)+1;


            for (int a=0;a<i-1;a++) {

                for(int b=0;b<i;b++) {

                    if(b<i-a-1){
                        System.out.print(" ");
                    }else {
                        System.out.print("* ");
                    }


                }
                System.out.println();
            }
            for (int a=0;a<i;a++) {
                for(int b=0;b<i;b++) {

                    if(b<a){
                        System.out.print(" ");
                    }

                    if(b>=a){
                        System.out.print("* ");
                    }

                }
                System.out.println();
            }


        }
    }
}
