package BOJ_10825;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class DH_10825 {

    public static void main(String args[]) throws Exception {

        //입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[][] arr = new String[N][4];
        for (int i = 0; i < N; i++) {
            arr[i] = br.readLine().split(" ");
        }
        br.close();
        
        Score score = new Score();

        //정렬
        Arrays.sort(arr, score);

        //출력
        for (int i = 0; i < N; i++) {
            System.out.println(arr[i][0]);
        }
        
    }
}

class Score implements Comparator<String[]> {
    
    @Override
    public int compare(String[] s1, String[] s2) {

        if (Integer.parseInt(s1[1]) == Integer.parseInt(s2[1])) {
            if (Integer.parseInt(s1[2]) == Integer.parseInt(s2[2])) {
                if (Integer.parseInt(s1[3]) == Integer.parseInt(s2[3])) {
                    
                    //4순위: 이름 오름차순
                    return s1[0].compareTo(s2[0]);
                }

                //3순위: 수학 점수 = 내림차순
                return Integer.compare(Integer.parseInt(s2[3]), Integer.parseInt(s1[3]));

            }
            //2순위: 영어 점수 = 오름차순
            return Integer.compare(Integer.parseInt(s1[2]), Integer.parseInt(s2[2]));
        }
        //1순위: 국어점수 = 내림차순
        return Integer.compare(Integer.parseInt(s2[1]), Integer.parseInt(s1[1]));
    }
}