package BOJ_2805;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] arr = new int[N];

        int l = 0;
        int r = 0;

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            if (r<arr[i]) r=arr[i];
        }

        // Arrays.sort(arr);

        // int l = 0;
        // int r = arr.length - 1;


        while (l < r) {
            long sum = 0;
            int m = (l+r) >>> 1;

            for (int height : arr) {
                if(height-m>0)
                sum += (height-m);
            }
            if (sum == M) {
                l=++m;
                break;
            } else if (sum > M) {
                l=++m;
            } else if (sum < M) {
                r=m;
            }
            

        }

        System.out.println(l-1);
    }
}