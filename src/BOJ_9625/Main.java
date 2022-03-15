package BOJ_9625;

import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int K = sc.nextInt();
       int[] A = new int[K+1];
       int[] B = new int[K+1];
       A[0]=1; B[0]=0;
       A[1]=0; B[1]=1;
       A[2]=1; B[2]=1;
       A[3]=1; B[3]=2;
       for (int i=3; i<=K-2; i++) {
        
       }

       sc.close();
   } 
}
