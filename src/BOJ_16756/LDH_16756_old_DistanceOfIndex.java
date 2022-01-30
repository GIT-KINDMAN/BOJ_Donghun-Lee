package BOJ_16756;

//import java.util.Arrays;
//import java.util.Iterator;
//import java.util.Set;
//import java.util.TreeSet;
import java.util.Arrays;
//import java.util.StringTokenizer;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.ArrayList;

public class LDH_16756_old_DistanceOfIndex {

    public static void main(String args[]) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] list = new int[N];

        for(int i=0; i<N; i++) {
            list[i]=Integer.parseInt(st.nextToken());
        }

        // 배열이 아닌 list로 선언하여 Collection.Sort 실행 후 get(0) get(length-1)해도 되긴 함
        Integer min = Integer.MAX_VALUE;
        Integer max = Integer.MIN_VALUE;
        for (int i=0; i<N; i++) {
            if(min > list[i]) min = list[i];
            if(max < list[i]) max = list[i];
        }
        
        int countMin=0;
        int countMax=0;
        for (int i=0; i<N; i++){
            if(min==list[i]) countMin++;
            if(max==list[i]) countMax++;
        }

        ArrayList<Integer> listMin = new ArrayList<Integer>(countMin);
        ArrayList<Integer> listMax = new ArrayList<Integer>(countMax);

        for (int i=0; i<N; i++) {
            if(min == list[i]) listMin.add(i);
            if(max == list[i]) listMax.add(i);
        }
        
        // Test list
        System.out.println("listMin: "+Arrays.deepToString(listMin.toArray()));
        System.out.println("listMax: "+Arrays.deepToString(listMax.toArray()));

        int distance = Integer.MAX_VALUE;
        for (int i=0; i<countMax; i++) {
            for (int j=0; j<countMin; j++) {
                if (listMax.get(i) > listMin.get(j)) {
                   if (distance > Math.abs(listMax.get(i)-listMin.get(j))) distance = Math.abs(listMax.get(i)-listMin.get(j));
                }
            }
        }

        System.out.println(distance);

    }
}

        //int[] arrMax = new int[countMax];


        // ArrayList<Integer> list = new ArrayList<Integer>(N);
        // // ArrayList<Integer> listSort = new ArrayList<Integer>();

        // // int[] list = new int[N];

        // for(int i=0; i<N; i++) {
        //     list.add(Integer.parseInt(br.readLine()));
        // }

        // Integer min = Integer.MAX_VALUE;
        // Integer max = Integer.MIN_VALUE;
        // for (int i=0; i<N; i++) {
        //     if(min > list.get(i)) min = list.get(i);
        //     if(max < list.get(i)) max = list.get(i);
        // }
        
        // int findMinIndex = list.indexOf(min);
        // int findMaxIndex = list.indexOf(max);

        // while (findMinIndex != -1) {
        //     findMinIndex = list.indexOf(findMinIndex,min);
        // }

        // System.out.println(findMinIndex);
        // System.out.println(findMaxIndex);
        


        /* final final
            뭐야 예제 TC보니까 값 차이 맞는데?
        */

        /* final
           아 이런
           문제 자체가 그게 아니었다
           각 인접한 인덱스의 값 비교 후 가장 큰 차이값을 return 하는건줄 알았는데
           그냥 단순히 max min 찾고 인덱스 거리 구하는거였다
        */
           
        //   정렬: NlogN

        /* 입력을 TreeSet으로 받아서 미리 정렬 + 중복 제거 해줘서 N 부담을 줄여주려고 했는데
           [i]와 [i+1]을 비교할 방법이 없어서 그냥 배열로 처리하는게 나을지도
        
        Set<Integer> set = new TreeSet<Integer>();

        for(int i=0; i<N; i++) {
            set.add(Integer.parseInt(br.readLine()));
        }

        Iterator<Integer> iter = set.iterator();

        int gap=0;

        while(iter.hasNext()) {

        }
        
N (10^6)

NlogN = TreeSet 입력완료 시



N + N^2 (Arrays.sort 사용 시: 참조 지역성 좋으면 ㄱㅊ)

N + NlogN (Collection.sort 사용 시: NlogN) + 
-> ArrayList 사용할까?

N(최초입력) + N([i][i+1]비교) -> 그냥 이게 제일 낫겠다



        //Arrays.sort(arr);
*/