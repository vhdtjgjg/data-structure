package com.dubhe.k_pattern.demo;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String s;
        StringBuilder sb = new StringBuilder();
        while ((s = bf.readLine()) != null) {
            int n = Integer.parseInt(s);
            for (int i = n; i > 0; i--) {
                for (int j = i + 1; j > 0; j--) {
                    sb.append("* ");
                }
                for (int j = 0; j < n - i; j++)
                    sb.append(' ');
                sb.append("\n");
            }

            for (int i = 0; i <= n; i++) {
                for (int j = i + 1; j > 0; j--) {
                    sb.append("* ");
                }
                for (int j = n; j > i; j--)
                    sb.append(' ');

                sb.append("\n");
            }
            System.out.print(sb);
            sb.setLength(0);
        }
    }
}