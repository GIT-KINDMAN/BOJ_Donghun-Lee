package BOJ_10819;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    static int[] arr, ans;
    static int N, med, sum;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        N = Integer.parseInt(br.readLine());

        arr = new int[N];
        ans = new int[N];

        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        med = N / 2;

        if (N % 2 == 0) {
            med -= 1;
        }
        ans[0] = arr[med];

        int start = 0, end = N - 1;
        for (int i = 1; i < N; i = i + 2) {
            ans[i] = arr[end];
            if (start != med) {
                ans[i+1] = arr[start];
            }
            start++;
            end--;
        }

        for (int i = 0; i < N - 1; i++) {
            sum += Math.abs(ans[i + 1] - ans[i]);
        }
        System.out.println(sum);
    }
}