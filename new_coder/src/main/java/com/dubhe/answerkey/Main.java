package com.dubhe.answerkey;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String[] s = bufferedReader.readLine().split(" ");

        //score1=60,score2=80,score3=90
        System.out.println("score1="+s[0]+",score2="+s[1]+",score2="+s[2]);
    }
}
