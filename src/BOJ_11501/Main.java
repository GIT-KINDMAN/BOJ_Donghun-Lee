package BOJ_11501;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            int M = Integer.parseInt(br.readLine());
            
            int[] arr = new int[M+1];
            int max = 0;
            long sum = 0;

            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                arr[j] = Integer.parseInt(st.nextToken());
            }
            for (int j = M - 1; j >= 0; j--) {// 뒤에서 부터 비교
                if (arr[j] > max) // 현재 가격이 지금까지 가장 비쌀때 보다 크다면
                    max = arr[j]; // max = stock[i]
                else
                    sum += (max - arr[j]);// 아니면 팔았을 때 이득을 더 해준다.(가장 비싼가격 - 현재 가격)
            }
            System.out.println(sum);
        }
        br.close();
    }
}