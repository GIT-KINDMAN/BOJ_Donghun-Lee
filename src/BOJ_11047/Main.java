package BOJ_11047;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(br.readLine());
        }

        int count = 0;
        int tmp = 0;
        for (int i = n - 1; i >= 0; i--) {
            if (k >= a[i]) {
                tmp = k / a[i];
                k = k % a[i];
                count += tmp;
            }
        }
        System.out.println(count);
    }
}
// 4200>1000

// 4200/1000 count=+몫 mod=%

// 200/100

// if(나머지==0)finish
