package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {
    private static int getSum(Deque<Integer> dq) {
        int sum = 0;
        int before = dq.pollFirst();
        while (!dq.isEmpty()) {
            int current = dq.pollFirst();
            sum += Math.abs(before - current);
            before = current;
        }
        return sum;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        Deque<Integer> dq = new ArrayDeque<>();
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);

        int minIndex = 0;
        int maxIndex = n - 1;
        boolean toggled = false;
        for (int i = 0; i < n - 1; i+=2) {
            if (toggled) {
                dq.offerLast(arr[minIndex++]);
                dq.offerFirst(arr[maxIndex--]);
            } else  {
                dq.offerFirst(arr[minIndex++]);
                dq.offerLast(arr[maxIndex--]);
            }
            toggled = !toggled;
        }
        if (n % 2 != 0) {
            int first = dq.peekFirst();
            int last = dq.peekLast();
            int med = arr[n / 2];
            if (Math.abs(first - med) > Math.abs(last - med)) {
                dq.offerFirst(med);
            } else {
                dq.offerLast(med);
            }
        }

        System.out.println(getSum(dq));
    }
}
