package BOJ_16756;

//import java.util.Arrays;
//import java.util.Iterator;
//import java.util.Set;
//import java.util.TreeSet;
//import java.util.Arrays;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class LDH_16756 {

    public static void main(String args[]) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] list = new int[N];

        for(int i=0; i<N; i++) {
            list[i]=Integer.parseInt(st.nextToken());
        }

        int min = Integer.MAX_VALUE;
        for(int i=0; i<N-1; i++) {
            if (min>Math.abs(list[i]-list[i+1])) {
                min = Math.abs(list[i]-list[i+1]);
            }
        }
        System.out.println(min);
    }
}