package BOJ_4358;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;

// 생태학
// 문자열 문제(해시맵 ?)
public class Main {
    static HashMap<String, Integer> map;
    static int count;

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        map = new HashMap<String, Integer>();
        while (br.readLine() != null || br.readLine().length() != 0) {

            map.put(br.readLine(), map.getOrDefault(br.readLine(), 0) + 1);
            count++;

        }

        // 키 기준 정렬
        Object[] keys = map.keySet().toArray();
        Arrays.sort(keys);

        StringBuilder sb = new StringBuilder();
        for (Object key : keys) {
            String keyStr = (String) key;
            int count = map.get(keyStr);
            double per = (double) (count * 100.0) / count;

            sb.append(keyStr + " " + String.format("%.4f", per) + "\n"); // 소수점 4번 째 자리까지 출력
        }

        System.out.println(sb);
    }
}