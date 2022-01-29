package BOJ_2422;

import java.util.Scanner;

public class LDH_2422 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        Pyramid(N);

        sc.close();
    }
    
    private static void Pyramid(int N) {
        for (int i = 1; i <= N; i++) {
            for (int j = N - i; j >= 1; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (i - 1) * 2 + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
    }
}