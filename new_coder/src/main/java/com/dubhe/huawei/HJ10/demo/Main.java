package com.dubhe.huawei.HJ10.demo;

import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[]args)throws Exception{
        BufferedReader shuru = new BufferedReader(new InputStreamReader(System.in));
        String s = shuru.readLine();
        s="uqic^g`(s&jnl(m#vt!onwdj(ru+os&wx";
        int[] a = new int[128];
        int count=0;
        for(int i=0;i<s.length();i++){
            char b = s.charAt(i);
            if(a[b]==0){
                count++;
                a[b]=1;
            }
        }
        System.out.println(count);
    }

    public static void demo(String s){

        int[] a = new int[128];
        int count=0;
        for(int i=0;i<s.length();i++){
            char b = s.charAt(i);
            if(a[b]==0){
                System.out.print(b);
                count++;
                a[b]=1;
            }
        }
        System.out.println(count);
    }
}