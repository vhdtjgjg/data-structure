package com.dubhe.ascll1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int[] i={73, 32, 99, 97, 110, 32, 100, 111, 32, 105, 116 , 33};

        Arrays.stream(i).forEach(num->{
            System.out.print((char) num);
        });


    }
}
