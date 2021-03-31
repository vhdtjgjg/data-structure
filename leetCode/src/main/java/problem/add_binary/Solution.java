package problem.add_binary;

import org.junit.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Solution {
    public static String addBinary(String a, String b) {

        int aLength = a.length();
        int bLength = b.length();
        int carry=0;
        int sum=0;
        StringBuilder stringBuilder = new StringBuilder();

        while (aLength>0&&bLength>0){
            sum = a.charAt(--aLength) - '0';
            sum += b.charAt(--bLength) - '0'+carry;
            carry=sum/2;
            stringBuilder.append(sum%2);
        }

        while (aLength>0){
            sum = carry+a.charAt(--aLength) - '0';
            carry=sum/2;
            stringBuilder.append(sum%2);
        }

        while (bLength>0){
            sum = carry+b.charAt(--bLength) - '0';
            carry=sum/2;
            stringBuilder.append(sum%2);
        }

        if(carry!=0){
            stringBuilder.append(1);
        }

        return stringBuilder.reverse().toString();
    }

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        while (true){
            System.out.println("输入");
            String a = bufferedReader.readLine();
            String b = bufferedReader.readLine();
            System.out.println(a);
            System.out.println(b);
            String s = addBinary(a, b);
            System.out.println(s);
        }
    }

    @Test
    public void test() throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String c = bufferedReader.readLine();
        System.out.println(c);
        while (true){
            System.out.println("输入");
            String a = bufferedReader.readLine();
            String b = bufferedReader.readLine();
            System.out.println(a);
            System.out.println(b);
            String s = addBinary(a, b);
            System.out.println(s);
        }
    }
}