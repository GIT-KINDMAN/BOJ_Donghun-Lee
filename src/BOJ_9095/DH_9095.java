package BOJ_9095;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
//import java.util.Arrays;
import java.util.StringTokenizer;

public class DH_9095 {
    static int t;
    static int n, m;
    static int[] arrN, arrM;
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        //tc 개수 입력
        t = Integer.parseInt(br.readLine());

        for(int i=0; i<t; i++) {
            inputTC();
            outputTC();
        }
    }

    static void inputTC() throws IOException {

        StringTokenizer st;

        // N, M 원소 갯수 입력
        st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        
    }

    static void outputTC() {
        System.out.println();
    }
}