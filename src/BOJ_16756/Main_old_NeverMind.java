package BOJ_16756;

//import java.util.Arrays;
//import java.util.Iterator;
//import java.util.Set;
//import java.util.TreeSet;
//import java.util.Arrays;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.ArrayList;


public class Main_old_NeverMind {

    public static void main(String args[]) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] list = new int[N];

        for(int i=0; i<N; i++) {
            list[i]=Integer.parseInt(st.nextToken());
        }

        // 배열이 아닌 list로 선언하여 Collection.Sort 실행 후 get(0) get(length-1)해도 되긴 함
        // 입력 전체에서 max, min값 찾기
        Integer min = Integer.MAX_VALUE;
        Integer max = Integer.MIN_VALUE;
        for (int i=0; i<N; i++) {
            if(min > list[i]) min = list[i];
            if(max < list[i]) max = list[i];
        }
        
        // 중복되는 최소, 최대값 개수 찾기
        int countMin=0;
        int countMax=0;
        for (int i=0; i<N; i++){
            if(min==list[i]) countMin++;
            if(max==list[i]) countMax++;
        }

        ArrayList<Integer> listMin = new ArrayList<Integer>(countMin);
        ArrayList<Integer> listMax = new ArrayList<Integer>(countMax);

        // 모든 최소, 최대값 indexOf
        for (int i=0; i<N; i++) {
            if(min == list[i]) listMin.add(i);
            if(max == list[i]) listMax.add(i);
        }
        
        // Test list
        //  System.out.println("listMin: "+Arrays.deepToString(listMin.toArray()));
        //  System.out.println("listMax: "+Arrays.deepToString(listMax.toArray()));

        int ans = 0;
        for (int i=0; i<countMax; i++) {
            for (int j=0; j<countMin; j++) {
              //  if (listMax.get(i) > listMin.get(j)) {
                   ans = Math.abs(list[listMax.get(i)]-list[listMin.get(j)]);
              //  }
            }
        }

        System.out.println(ans);

    }
}