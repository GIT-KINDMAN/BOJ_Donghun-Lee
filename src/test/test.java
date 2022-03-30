package test;

import java.util.*;
import java.io.*;

public class test {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        while (T-- > 0) {
            String str = br.readLine();

            int l = 3;
            int r = str.length() - 1;
            int m = str.length() / 2;

            String temp = "";
            System.out.println(str.substring(0,l));
            System.out.println(str.substring(l,r));

            temp = str.substring(0, l) + str.substring(l + 1, r);

            System.out.println(temp);
            // char[] ca = str.toCharArray();

            // for (int i = 0; i < substr1.length(); i++) {
            //     System.out.println(i + ": " + substr1.charAt(i));
            // }
        }
    }
}
