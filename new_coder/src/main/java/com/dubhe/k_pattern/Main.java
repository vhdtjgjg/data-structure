package com.dubhe.k_pattern;

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

                for(int b=i-a;b>0;b--) {

                    System.out.print("* ");


                }
                if(a<i-2){
                    System.out.println();
                }

            }

            for (int a=0;a<i+1;a++) {

                for(int b=0;b<a;b++) {

                    System.out.print("* ");


                }
                System.out.println();
            }



        }
    }
}
